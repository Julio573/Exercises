package ex7;

import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = scanner.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] vect3 = new int[n];

        System.out.println("Digite os valores do Vetor 1");
        for (int i = 0; i < n; i++) {
            vect1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do Vetor 2");
        for (int i = 0; i < n; i++) {
            vect2[i] = scanner.nextInt();
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i++) {
            vect3[i] = vect1[i] + vect2[i];
            System.out.println(vect3[i]);
        }
    }
}
