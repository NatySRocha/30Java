package exerciciosLista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Olá Mundo!");
		
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		
		
		System.out.println("digite o numero de anos:");
		anos = leia.nextInt();
		System.out.println("digite o numero de meses:");
		meses = leia.nextInt();
		System.out.println("digite o numero de dias:");
      dias = leia.nextInt();
      
      
      
      totalDias = (anos * 365) + (meses * 30) + dias;
    		  System.out.println("Total de dias:" + totalDias);
		

	}

}
