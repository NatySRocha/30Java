package Exercicio5;
import  java.util.Scanner ;

public  class  Exercicio5 {

	public  static  void  main ( String [] args ) {
		Scanner leia =  novo  Scanner ( Sistema . In );

		int numero1, numero2, numero3;

		Sistema . para fora . println ( " Digite o primeiro n�mero: " );
		numero1 = leia . nextInt ();
		Sistema . para fora . println ( " Digite o segundo n�mero: " );
		numero2 = leia . nextInt ();
		Sistema . para fora . println ( " Digite o terceiro n�mero: " );
		numero3 = leia . nextInt ();

		if (numero1 > = numero2 && numero1 > = numero3) {
			Sistema . para fora . printf ( " % d � maior que% de% d " , numero1, numero2, numero3);
		}
		else  if (numero2 > = numero1 && numero2 > = numero3) {
			Sistema . para fora . printf ( " % d � maior que% de% d " , numero2, numero1, numero3);
		}
		else {
			Sistema . para fora . printf ( " % d � maior que% de% d " , numero3, numero1, numero2);
		}


	}

}