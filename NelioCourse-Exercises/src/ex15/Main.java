package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(scanner.nextLine(), formatter);
        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
        System.out.println(reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate newCheckIn = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate newCheckOut = LocalDate.parse(scanner.nextLine(), formatter);
        reservation.updateDates(newCheckIn, newCheckOut);
        System.out.println(reservation);


        scanner.close();
    }
}
