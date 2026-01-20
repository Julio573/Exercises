package ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaPessoa = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Pessoa física ou jurídica: (f/j): ");
            char opcao = scanner.nextLine().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Receita anual: ");
            double receita = scanner.nextDouble();
            scanner.nextLine();

            if (opcao == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastos = scanner.nextDouble();
                scanner.nextLine();
                listaPessoa.add(new PessoaFisica(nome, receita, gastos));
            } else if (opcao == 'j') {
                System.out.print("Número de funcionários: ");
                int funcionarios = scanner.nextInt();
                scanner.nextLine();
                listaPessoa.add(new PessoaJuridica(nome, receita, funcionarios));
            }
            System.out.println();
        }

        double totalImposto = 0.0;
        System.out.println();
        System.out.println("Impostos pagos:");
        for (Pessoa pessoa : listaPessoa) {
            System.out.println(pessoa);
            totalImposto += pessoa.tax();
        }

        System.out.println();
        System.out.printf("Total de imposto pago: $%.2f", totalImposto);

        scanner.close();
    }
}
