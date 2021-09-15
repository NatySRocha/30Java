package Repositorio;

public class UserRepository {
	package  org.generation.blogPessoal.repository ;

	import  java.util.List ;
	import  java.util.Optional ;

	import  org.generation.blogPessoal.model.User ;
	import  org.springframework.data.jpa.repository.JpaRepository ;
	import  org.springframework.stereotype.Repository ;

	@Repositório
	 interface  pública UserRepository  extends  JpaRepository < User , Long > {
		public  Opcional < Usuário >  findByUsername ( String  nome do usuário );

		// JUnity
		 Lista  pública < Usuário > findAllByNomeContainingIgnoreCase ( String  nome );

		// JUnity
		public  User  findByNome ( String  nome );
	}
}
