package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
            scanner.nextLine();
            nome[i] = scanner.nextLine();
            nota1[i] = scanner.nextDouble();
            scanner.nextLine();
            nota2[i] = scanner.nextDouble();
        }

        double media = 0.0;
        System.out.println("Alunos aprovados:");
        for (int i=0; i<n; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if(media >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        scanner.close();
    }
}
