package  Exercicio2 ;

public  class  exercicio2 {

	public  static  void  main ( String [] args ) {


		Aluno exemplo1 = new  Aluno ();
		Aluno exemplo2 =  new Aluno ();
		exemplo1 . name =  " EPAMINONDAS " ;
		exemplo1 . matrícula =  " MAT-1 " ;
		exemplo1 . nota =  5 ;
		exemplo1 . anoNascimento =  2005 ;

		exemplo2 . nome =  " MARIA " ;
		exemplo2 . matrícula =  " MAT-200 " ;
		exemplo2 . nota =  10 ;
		exemplo2 . anoNascimento =  1978 ;

		exemplo1 . mostraIdade ( 2030 );
		exemplo2 . mostraIdade (0);


	}

}