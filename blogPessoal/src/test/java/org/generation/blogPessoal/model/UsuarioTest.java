package org.generation.blogPessoal.model;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


				//Randomiza a porta
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioTest {
	
	public Usuario usuario;
	public Usuario usuarioNulo = new Usuario();
	
	//Verificar as anotações que eu inseri dentro do usario model
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	
	//
	Validator validator = factory.getValidator(); 
	
	
	@BeforeEach
	public void start() {
		
		usuario = new Usuario(0L,"Lucas Aguiar", "Lucas.Nunes2500@hotmail.com", "159753");		
	}
	
	@Test
	@DisplayName("✔ Valida Atributos Não Nulos")
	void testValidaAtributos() {
		
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario);

		System.out.println(violacao.toString());

		assertTrue(violacao.isEmpty());
	}

	@Test
	@DisplayName("✖ Não Valida Atributos Nulos")
	void testNaoValidaAtributos() {
		
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuarioNulo);

		System.out.println(violacao.toString());

		assertFalse(violacao.isEmpty());
	}
}
