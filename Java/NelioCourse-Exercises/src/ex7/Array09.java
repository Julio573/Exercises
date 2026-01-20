package ex7;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int pessoaMaisVelha = idades[0];
        int posicaoMaior = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] > pessoaMaisVelha) {
                pessoaMaisVelha = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Pessoa mais velha = " + nomes[posicaoMaior]);

        scanner.close();
    }
}
