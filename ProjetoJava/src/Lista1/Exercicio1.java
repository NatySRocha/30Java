package Lista1;

import java.util.Scanner;

public class Exercicio1 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in); 
		int numero1, numero2, numero3;
		System.out.print("digite o primeiro numero: ");
		numero1 = leia.nextInt();
			System.out.print("digite o segundo numero: ");
		numero2 = leia.nextInt();
			System.out.print("digite o terceiro numero: ");
		numero3 = leia.nextInt();
		if(numero1>numero2 && numero1>numero3) {
			System.out.print("o maior numero �: " +numero1);
			
		}
		else if(numero2>numero3 && numero2>numero1) {
			System.out.print("o maior numero �: " +numero2);
		}
		else if(numero3>numero1 &&numero3>numero2) {
			System.out.print("o maior numero �: " +numero3);
		}
		
	}

}
