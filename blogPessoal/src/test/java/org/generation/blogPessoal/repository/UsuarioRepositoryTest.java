package org.generation.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Vai executar uma vez só e depois todos os teste serão executados 
	
	@BeforeAll
	void start() {
		
		Usuario usuario = new Usuario(0,"Lucas Aguiar", "Lucas.Nunes2500@hotmail.com", "159753");
		
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		 usuario = new Usuario(0,"Gabrielle Aguiar", "Gaby@hotmail.com", "123456");
		
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		 usuario = new Usuario(0,"Jessica Aguiar", "Jessy@hotmail.com", "789456");
		
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		 usuario = new Usuario(0,"Ronaldinho", "MelhorDoMundo@hotmail.com", "Flamengo");
		
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
	}
	
	@Test
	@DisplayName("🔐💾 Retorna Nome: ")
	public void findByRetornaNome() {
		
		Usuario usuario = usuarioRepository.findByNome("Ronaldinho");
		assertTrue(usuario.getNome().equals("Ronaldinho"));
	}
	
	
	@Test
	@DisplayName("🔐💾 Retorna 3 Usuários")
	public void findAllByNomeContainingIgnoreCaseRetornaTresUsuarios() {
		
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Aguiar");
		assertEquals(3, listaDeUsuarios.size());
		
	}
	
	@AfterAll
	public void end() {
		
		System.out.println("Teste foi finalizado");
		
	}
}

