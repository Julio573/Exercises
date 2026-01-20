package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Rent[] rent = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();

            rent[room] = new Rent(name, email, room);
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        scanner.close();
    }
}
