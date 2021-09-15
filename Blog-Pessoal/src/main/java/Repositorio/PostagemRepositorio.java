package Repositorio;

public class PostagemRepositorio {
	package  org.generation.blogPessoal.repository ;

	import  java.util.List ;

	import  org.generation.blogPessoal.model.Postagem ;
	import  org.springframework.data.jpa.repository.JpaRepository ;
	import  org.springframework.stereotype.Repository ;

	@Repositório
	public  interface  PostagemRepository  extends  JpaRepository < Postagem , Long > {
		 Lista  pública < Postagem > findAllByTituloContainingIgnoreCase ( String  titulo );
	}
}
