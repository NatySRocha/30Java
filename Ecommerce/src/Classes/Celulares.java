package Classes;

public class Celulares {

	    // ATRIBUTOS
	     Memoria de String privada ;

	    // METODOS

	    public  Celulares ( String  produto , int  estoque , String  codigo , valor duplo  ) {
	        super (produto, estoque, codigo, valor);
	        isso . memoria = memoria;

	    }


	    // CONSTRUTORES


	    public  String  getMemoria () {
	        return memoria;
	    }

	    public  void  setMemoria ( String  memoria ) {
	        isso . memoria = memoria;
	    }
	    @Sobrepor
	    public  void  IncluiEstoque ( int  quantidade ) {
	        if (quantidade >  2 ) {
	            Sistema . para fora . println ( " Você ganhou um brinde, Parabéns !! " );
	            isso . estoque + = quantidade;
	        } else {
	            isso . estoque + = quantidade;
	        }
	    }
