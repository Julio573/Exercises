package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = scanner.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            genero[i] = scanner.next().toUpperCase().charAt(0);
        }

        double soma = 0.0;
        int quantidadeHomes = 0;
        int quantidadeMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                soma += altura[i];
                quantidadeMulheres++;
            } else if (genero[i] == 'M') {
                quantidadeHomes++;
            }
        }

        double mediaAlturaMulheres = soma / quantidadeMulheres;

        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas da mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Quantidade de homens = %d%n", quantidadeHomes);

        scanner.close();
    }
}
