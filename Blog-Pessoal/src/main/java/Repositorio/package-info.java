package Repositorio;
package  org.generation.blogPessoal.repository ;

import static  org.junit.jupiter.api.Assertions.assertEquals ;
import static  org.junit.jupiter.api.Assertions.assertTrue ;

import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;
import  java.util.List ;

import  org.generation.blogPessoal.model.User ;
import  org.junit.jupiter.api.AfterAll ;
import  org.junit.jupiter.api.BeforeAll ;
import  org.junit.jupiter.api.DisplayName ;
import  org.junit.jupiter.api.Test ;
import  org.junit.jupiter.api.TestInstance ;
import  org.junit.jupiter.api.TestInstance.Lifecycle ;
import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.boot.test.context.SpringBootTest ;
import  org.springframework.boot.test.context.SpringBootTest.WebEnvironment ;

@SpringBootTest ( webEnvironment  =  WebEnvironment . RANDOM_PORT )
@TestInstance ( Lifecycle . PER_CLASS )
public  class  UserRepositoryTest {

	@Autowired
	private  UserRepository usuarioRepository;

	@Antes de tudo
	void  start () {

		Dados LocalDate =  LocalDate . parse ( " 2003-01-27 " , DateTimeFormatter . ofPattern ( " aaaa-MM-dd " ));

		Utilizador usuario =  novo  Utilizador ( 0 , " João Pedro da Cruz " , " jotaskrt " , " 123456 " , dados);
		if ( ! usuarioRepository . findByUsername (usuario . getUsername ()) . isPresent ())
			usuarioRepository . salvar (usuario);

		usuario =  novo  usuário ( 0 , " Nayza Matos Cruz " , " nayza " , " 123456 " , dados);
		if ( ! usuarioRepository . findByUsername (usuario . getUsername ()) . isPresent ())
			usuarioRepository . salvar (usuario);

		usuario =  novo  usuário ( 0 , " Ana Beatriz Yujra Matos " , " biaespejo " , " 123456 " , dados);
		if ( ! usuarioRepository . findByUsername (usuario . getUsername ()) . isPresent ())
			usuarioRepository . salvar (usuario);

		usuario =  novo  usuário ( 0 , " Giovanna Rosimira Cruz " , " gigica " , " 123456 " , dados);
		if ( ! usuarioRepository . findByUsername (usuario . getUsername ()) . isPresent ())
			usuarioRepository . salvar (usuario);
	}

	@Teste
	@DisplayName ( " 💾 Retorna o nome " )
	public  void  findByNomeRetornaNome () {
		Usuário usuario = usuarioRepository . findByNome ( " João Pedro da Cruz " );
		assertTrue (usuario . getNome () . equals ( " João Pedro da Cruz " ));
	}

	@Teste
	@DisplayName ( " 💾 Retorna 3 usuarios " )
	public  void  findAllByNomeContainingIgnoreCaseRetornaTresUsuarios () {
		List < User > listaDeUsuarios = usuarioRepository . findAllByNomeContainingIgnoreCase ( " Cruz " );
		assertEquals ( 3 , listaDeUsuarios . size ());
	}

	@Afinal
	public  void  end () {
		Sistema . para fora . println ( " Teste finalizado! " );
	}

}