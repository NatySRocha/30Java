package org.generation.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private Usuario usuario;
	private Usuario usuarioUpdate;
	private Usuario usuarioAdmin;
	
	@BeforeAll
	public void start() {
		
		usuarioAdmin = new Usuario(0L,"Administrador", "Adermilson@hotmail.com", "admin123");	
		
		if(usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()){
			
			HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
			
		}
		
		usuario = new Usuario(0L,"Ronaldinho", "Gaucho@hotmail.com", "Jogado123");
		usuarioUpdate = new Usuario(0L,"Administrador", "Adermilson@hotmail.com", "admin123");
	}
	
	@Test
	@DisplayName("✔ Cadastrar Usuário!")
	@Order(1)
	public void deveRealizarPostUsuario() {
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
		
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}
	
	@Test
	@DisplayName("✔ Listar todos os Usuários!")
	@Order(2)
	public void deveRealizarGetAllUsuario() {
		
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("Adermilson@hotmail.com", "admin123")
		.exchange("/usuarios/all", HttpMethod.GET, null, String.class);	
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@DisplayName("✔ Alterar Usuário!")
	@Order(3)
	public void deveRealizarPUTUsuario() {
		
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioUpdate);
		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("Adermilson@hotmail.com", "admin123")
		.exchange("/usuarios/all", HttpMethod.PUT, request, Usuario.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}
	
}
