package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int number = scanner.nextInt();

        double[] vect = new double[number];

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextDouble();
            soma += vect[i];
        }

        double mediaVetor = soma / number;
        System.out.println();
        System.out.printf("Média do vetor = %.3f%n", mediaVetor);

        System.out.println("Elementos abaixo da média:");
        for (double values : vect) {
            if (values < mediaVetor) {
                System.out.println(values);
            }
        }
    }
}
