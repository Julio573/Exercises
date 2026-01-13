package ex7;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int number = scanner.nextInt();

        int[] vect = new int[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        int pares = 0;
        System.out.println("Números pares:");
        for (int n : vect) {
            if (n % 2 == 0) {
                pares++;
                System.out.print(n + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares = " + pares);

        scanner.close();
    }
}
