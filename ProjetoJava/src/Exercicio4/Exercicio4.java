package Exercicio4;

import java.util.Scanner;


public class Exercicio4 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);

		double nota1, nota2, nota3, media;
		double peso1 = 0.2, peso2 = 0.3, peso3 = 0.5;

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();

		media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

		System.out.printf("A média é: %.2f", media);


	}
}