package aulas;
public class anima {



	// Atributos
	private  String nome;
	privado  int idade;
	 som booleano privado ;
	 som booleano privado ;	

	// Construtor
	public  Animal ( String  nome , int  idade , boolean  som ) {
		super ();
		isso . nome = nome;
		isso . idade = idade;
		isso . som = som;
	}

	// encapsuladores
	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  int  getIdade () {
		voltar idade;
	}

	public  void  setIdade ( int  idade ) {
		isso . idade = idade;
	}

	public  boolean  isSom () {
		return som;
	}

	public  void  setSom ( boolean  som ) {
		isso . som = som;
	}

	 correr void  público ( corre booleano ) { 
		if (corre) {
			Sistema . para fora . println ( " Corre " );
		}
		else {
			Sistema . para fora . println ( " Não corre " );
		}
	}

	// Metodos
	public  void  emiteSom () {
		Sistema . para fora . println ( " Emitindo som ... " );
	}
}


