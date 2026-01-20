package ex13;

import ex12.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> productList= new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char option = scanner.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            if (option == 'i') {
                System.out.print("Customs Fee: ");
                double customsFee = scanner.nextDouble();
                scanner.nextLine();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (option == 'c') {
                productList.add(new Product(name, price));
            } else if (option == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                productList.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println();
        System.out.println("Price tags:");
        for (Product product : productList) {
            System.out.println(product);
        }

        scanner.close();
    }
}
