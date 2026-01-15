package ex11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println();
        System.out.println("Enter Order Data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
        LocalDateTime moment = LocalDateTime.now();

        Order order = new Order(new Client(name, email, birthDate), moment, status);

        System.out.println();
        System.out.print("How many items to this order: ");
        int numberOfOrders = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Product Price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();
            order.totalPrice();

            OrderItem orderItem = new OrderItem(new Product(productName, productPrice), productQuantity, productPrice);
            order.addOrder(orderItem);
            System.out.println();
        }

        System.out.println();
        System.out.println(order);

        scanner.close();
    }
}
