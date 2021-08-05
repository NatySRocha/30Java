package Lista2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

            int numero, somaNumero = 0;

            do {
                System.out.printf("Digite o número: ");
                numero = leia.nextInt();
                somaNumero += numero;
            } while (numero != 0);

            System.out.printf("A soma dos números digitados é %d", somaNumero);


        }
}
