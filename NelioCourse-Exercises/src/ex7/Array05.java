package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int number = scanner.nextInt();

        double[] vect = new double[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextDouble();
        }

        double maiorValor = vect[0];
        int posicaoMaiorValor = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.printf("Maior valor = %.1f%n", maiorValor);
        System.out.println("Posicao maior valor = " + posicaoMaiorValor);
    }
}
