package exercicio2;

import java.util.Scanner;


public class Exercicio2 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);

		int segundosTotal, minutos, horas, segundos;

		System.out.println("Digite a quantidade total de segundos: ");
		segundosTotal = leia.nextInt();

		horas = segundosTotal / 3600;
		minutos = (segundosTotal%3600) / 60;
		segundos = (segundosTotal%3600) % 60;

		System.out.printf("%d Horas, %d minutos e %d segundos", horas, minutos, segundos);

	}
}