package  Exercicio1 ;

public  class  Cliente {

	public  String nome;
	public  int codigo;
	public  int anoNascimento;

	public  void  idade ( int  anoAtual ) {
		Sistema . para fora . println ( " Idade: "  + (anoAtual - anoNascimento));		
	}

}
