package ex7;

import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int number = scanner.nextInt();

        int[] vect = new int[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        int soma = 0;
        int pares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                pares++;
            }
        }

        if (pares == 0) {
            System.out.println("Nenhum número par");
        } else {
            double media = (double) soma / pares;
            System.out.printf("Média dos pares = %.1f%n", media);
        }

        scanner.close();
    }
}
