package Ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int addQuantity = scanner.nextInt();
        product.addProducts(addQuantity);

        System.out.println("\nProduct data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQuantity = scanner.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println("\nProduct data: " + product);

        scanner.close();
    }
}
