package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	//Método  Get buscando todas as informações
	@GetMapping("/all")
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(usuarioService.listarUsuarios());
	}
	
	
	// Método POST para logar
	@PostMapping ("/logar")
	public ResponseEntity <UserLogin> Authentication (@RequestBody Optional <UserLogin> user) {
		return usuarioService.Logar(user)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	
	//Método POST para Cadastrar
	@PostMapping ("/cadastrar")
	public ResponseEntity <Usuario> post(@RequestBody Usuario usuario) {
		return usuarioService.CadastrarUsuario(usuario)
				.map (resp -> ResponseEntity.status (HttpStatus.CREATED).body(resp))
				.orElse (ResponseEntity.status(HttpStatus.CONFLICT).build());
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> put(@RequestBody Usuario usuario) {
		return usuarioService.atualizarUsuario(usuario).map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
				.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
	
	
	
}
