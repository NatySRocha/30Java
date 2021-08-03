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
		/*
		 * / *
		 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

		 * /
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias 

		escreva ("digite o numero de anos:")
          leia (anos)
		escreva ("digite o numero de meses:")
	     leia (meses)
		escreva ("digite o numero de dias:")
		leia (dias)
		totalDias = (anos * 365) + (meses * 30) + dias
		escreva ("Total de dias:" + totalDias)

		 */

	}

}
