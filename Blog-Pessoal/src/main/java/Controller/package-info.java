package Controller;
import static  org.junit.jupiter.api.Assertions.assertEquals ;

import  java.text.ParseException ;
import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;

import  org.generation.blogPessoal.model.User ;
import  org.generation.blogPessoal.repository.UserRepository ;
import  org.junit.jupiter.api.BeforeEach ;
import  org.junit.jupiter.api.DisplayName ;
import  org.junit.jupiter.api.MethodOrderer ;
import  org.junit.jupiter.api.Order ;
import  org.junit.jupiter.api.Test ;
import  org.junit.jupiter.api.TestInstance ;
import  org.junit.jupiter.api.TestMethodOrder ;
import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.boot.test.context.SpringBootTest ;
import  org.springframework.boot.test.context.SpringBootTest.WebEnvironment ;
import  org.springframework.boot.test.web.client.TestRestTemplate ;
import  org.springframework.http.HttpEntity ;
import  org.springframework.http.HttpMethod ;
import  org.springframework.http.HttpStatus ;
import  org.springframework.http.ResponseEntity ;

@SpringBootTest ( webEnvironment  =  WebEnvironment . RANDOM_PORT )
@TestInstance ( TestInstance . Lifecycle . PER_CLASS )
@TestMethodOrder ( MethodOrderer . OrderAnnotation . Class)
public  class  UserControllerTest {

	@Autowired
	private  TestRestTemplate testRestTemplate;

	private  usuário usuario;
	 usuário privado usuarioUpdate;
	 Usuário privado usuarioAdmin;

	@Autowired
	 repositório particular de UserRepository ;

	@BeforeEach
	public  void  start () throws  ParseException {
		Dados LocalDate =  LocalDate . parse ( " 2003-01-27 " , DateTimeFormatter . ofPattern ( " aaaa-MM-dd " ));
		usuarioAdmin =  novo  usuário ( 0L , " Administrador " , " admin " , " 123456 " , dados);

		if ( ! repository . findByUsername (usuarioAdmin . getUsername ()) . isPresent ()) {			
			 HttpEntity < Usuário > pedido =  new  HttpEntity < usuário > (usuarioAdmin);
				testRestTemplate . exchange ( " / usuarios / cadastrar " , HttpMethod . POST , request, User . class);
		}

		LocalDate dataPost =  LocalDate . parse ( " 2000-01-29 " , DateTimeFormatter . ofPattern ( " aaaa-MM-dd " ));
		usuario =  novo  usuário ( 0L , " João Pedro Cruz " , " jotinha " , " 123456 " , dataPost);

		LocalDate dataPut =  LocalDate . parse ( " 2000-02-06 " , DateTimeFormatter . ofPattern ( " aaaa-MM-dd " ));
		usuarioUpdate =  novo  usuário ( 2L , " João Pedro Cruz Gomes " , " jotinha1 " , " 1234567 " , dataPut);

	}

	@Teste
	@Order ( 1 )
	@DisplayName ( " ✔ Cadastrar Usuário! " )
	void  deveRealizarPostUsuario () {
		HttpEntity < Usuário > pedido =  new  HttpEntity < usuário > (usuario);

		ResponseEntity < User > resposta = testRestTemplate . exchange ( " / usuarios / cadastrar " , HttpMethod . POST , request,
				Usuário . classe);

		assertEquals ( httpStatus . CRIADO , RESPOSTA . getStatusCode ());
	}

	@Teste
	@Order ( 2 )
	@DisplayName ( " 👍 Listar todos os Usuários! " )
	public  void  deveMostrarTodosUsuarios () {
		ResponseEntity < String > resposta = testRestTemplate . withBasicAuth ( " admin " , " 123456 " ) . troca ( " / usuarios / all " ,
				HttpMethod . GET , null , String . classe);

		assertEquals ( HttpStatus . OK , resposta . getStatusCode ());
	}

	@Teste
	@Order ( 3 )
	@DisplayName ( " 😳 Alteração do Usuário! " )
	public  void  deveRealizarPutUsuario () {
		HttpEntity < User > request =  new  HttpEntity < User > (usuarioUpdate);

		ResponseEntity < User > resposta = testRestTemplate . withBasicAuth ( " admin " , " 123456 " )
				.exchange ( " / usuarios / atualizar " , HttpMethod . PUT , request, User . class);

		assertEquals ( HttpStatus . OK , resposta . getStatusCode ());
	}

}