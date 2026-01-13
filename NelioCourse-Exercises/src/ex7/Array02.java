package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int vectLength = scanner.nextInt();

        double[] vect = new double[vectLength];

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextDouble();
            soma += vect[i];
        }

        double media = soma / vectLength;

        System.out.print("Valores = ");
        for (double values : vect) {
            System.out.print(values + " ");
        }

        System.out.println();
        System.out.printf("Soma = %.2f%n", soma);
        System.out.printf("media = %.2f%n", media);



        scanner.close();
    }
}
