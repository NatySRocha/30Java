package Model;
import static  org.junit.jupiter.api.Assertions.assertTrue ;

import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;
import  java.util.Set ;

import  javax.validation.ConstraintViolation ;
import  javax.validation.Validation ;
import  javax.validation.Validator ;
import  javax.validation.ValidatorFactory ;

import  org.junit.jupiter.api.BeforeEach ;
import  org.junit.jupiter.api.DisplayName ;
import  org.junit.jupiter.api.Test ;
import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.boot.test.context.SpringBootTest ;
import  org.springframework.boot.test.context.SpringBootTest.WebEnvironment ;

@SpringBootTest ( webEnvironment  =  WebEnvironment . RANDOM_PORT )
public  class  UserTest {

	 usuario public User ;
	public  User usuarioNulo =  new  User ();

	@Autowired
	 fábrica ValidatorFactory privada =  Validação . buildDefaultValidatorFactory ();

	Validador validador = fábrica . getValidator ();

	@BeforeEach
	public  void  start () {
		Dados LocalDate =  LocalDate . parse ( " 2003-01-27 " , DateTimeFormatter . ofPattern ( " aaaa-MM-dd " ));
		usuario =  novo  usuário ( 0L , " Natalia Rocha" , " Nati " , " 123456 " , dados);
	}

	@Teste
	@DisplayName ( " ✔ Valida Atributos Não Nulos " )
	void  testValidaAtributos () {
		Definir < ConstraintViolation < Usuário > > violacao = validador . validate (usuario);

		Sistema . para fora . println (violacao . toString ());

		assertTrue (violacao . isEmpty ());
	}

	@Teste
	@DisplayName ( " ✖ Não Valida Atributos Nulos " )
	void  testNaoValidaAtributos () {
		Definir < ConstraintViolation < Usuário > > violacao = validador . validate (usuarioNulo);

		Sistema . para fora . println (violacao . toString ());

		assertTrue (violacao . isEmpty ());
	}

}