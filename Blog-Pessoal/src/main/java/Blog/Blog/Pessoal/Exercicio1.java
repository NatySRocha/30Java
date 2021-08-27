package Blog.Blog.Pessoal;

public class Exercicio1 {
	package  org.generation.blogPessoal.repository ;

	import  java.util.List ;

	import  org.generation.blogPessoal.model.Tema ;
	import  org.springframework.data.jpa.repository.JpaRepository ;

	 interface  pública TemaRepository  estende  JpaRepository < Tema , Long > {
		 Lista  pública < Tema > findAllByDescricaoContainingIgnoreCase ( String  descricao );

	}

}
