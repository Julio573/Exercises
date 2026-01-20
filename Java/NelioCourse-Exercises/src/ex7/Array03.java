package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int vectLength = scanner.nextInt();

        People[] people = new People[vectLength];

        double soma = 0.0;
        for (int i = 0; i < people.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            people[i] = new People(nome, idade, altura);
            soma += people[i].getAltura();
        }

        double menorDezesseis = 0;
        for (People person : people) {
            if (person.getIdade() < 16) {
                menorDezesseis++;
            }
        }

        menorDezesseis = (menorDezesseis / vectLength) * 100;;
        double media = soma / vectLength;

        System.out.printf("Altura média %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos %.2f%%%n", menorDezesseis);

        for (People person : people) {
            if (person.getIdade() < 16) {
                System.out.println(person);
            }
        }

        scanner.close();
    }
}
