package Model;

public class Tema {

	package  org.generation.blogPessoal.model ;

	import  java.util.List ;

	import  javax.persistence.CascadeType ;
	import  javax.persistence.Entity ;
	import  javax.persistence.GeneratedValue ;
	import  javax.persistence.GenerationType ;
	import  javax.persistence.Id ;
	import  javax.persistence.OneToMany ;
	import  javax.persistence.Table ;
	import  javax.validation.constraints.NotBlank ;
	import  javax.validation.constraints.Size ;

	import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;

	@Entidade
	@Table ( name  =  " tb_tema " )
	public  class  Tema {

		@Identificação
		@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
		 id longo privado ;

		@NotBlank ( mensagem  =  " O atributo Descrição é obrigatório. " )
		@Size ( max  =  255 , message  =  " O atributo Descrição permite somente até 255 caracteres. " )
		privada  String descricao;

		@OneToMany ( mappedBy  =  " tema " , cascade  =  CascadeType . ALL )
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
