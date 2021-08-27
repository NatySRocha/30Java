package Blog.Blog.Pessoal;

public class Exercicio2 {

	

	import  java.util.List ;

	import  javax.persistence.CascadeType ;
	import  javax.persistence.Entity ;
	import  javax.persistence.GeneratedValue ;
	import  javax.persistence.GenerationType ;
	import  javax.persistence.Id ;
	import  javax.persistence.OneToMany ;
	import  javax.persistence.Table ;

	import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;
	import  com.sun.istack.NotNull ;

	@Entidade
	@Table (name =  " tb_tema " )


		public  class  Tema {
		@Identificação
		@GeneratedValue (estratégia =  GenerationType . IDENTITY )
		 id longo privado ;
		@Não nulo
		privada  String   descricao;
		@OneToMany (mappedBy =  " tema " , cascade =   CascadeType . ALL )
		@JsonIgnoreProperties ( " tema " )
		 Lista privada < Postagem > postagem;

		public  long  getId () {
			return id;
		}
		public  void  setId ( long  id ) {
			isso . id = id;
		}
		public  String  getDescricao () {
			return descricao;
		}
		public  void  setDescricao ( String  descricao ) {
			isso . descricao = descricao;
		}
		public  List < Postagem >  getPostagem () {
			retornar postagem;
		}
		public  void  setPostagem ( List < Postagem >  postagem ) {
			isso . postagem = postagem;
		}




	}
}
