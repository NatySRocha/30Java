package Lista1;

import java.util.Scanner;

public class exercicio2 {
	public static void main	(String [] args) {
	//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	Scanner leia = new Scanner(System.in);
	int idade;
	System.out.println("Digite sua idade");
	idade = leia.nextInt();
	if(idade>15 && idade<17) {
		System.out.println("sua categoria � juvenil");
		
	}
	else if (idade>10 && idade<14) {
		System.out.println("sua categoria � infantil");
	}
	else if (idade>18 && idade<25) {
		System.out.println("sua categoria � adulto");
	}
 

}
}