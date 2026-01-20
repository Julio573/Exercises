package ex7;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int number = scanner.nextInt();

        int[] vect = new int[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
