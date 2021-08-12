
package classes de pacotes ;

public  class  cavalo  extends  Animal {

	 correr booleano privado ;

	public  Cavalo ( String  nome , int  idade , boolean  som , boolean  correr ) {
		super (nome, idade, som);
		isso . correr = correr;
	}

	public  void  corre () {
		se (correr) {
			Sistema . para fora . printf ( " \ n Esse cavalo corre! " );
		}
		else {
			Sistema . para fora . printf ( " \ n Esse cavalo não corre! " );
		}
	}

	@Sobrepor
	public  void  emiteSom () {
		Sistema . para fora . println ( " \ n Riinnn em " );
	}

}