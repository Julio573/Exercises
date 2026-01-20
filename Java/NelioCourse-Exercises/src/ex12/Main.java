package ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n): ");
            char option = scanner.nextLine().charAt(0);
            System.out.print("Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            scanner.nextLine();

            if (option == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = scanner.nextDouble();
                scanner.nextLine();

                employeeList.add(new OutsourcedEmployee(employeeName, hours, valuePerHour, additionalCharge));
            } else {
                Employee employee = new Employee(employeeName, hours, valuePerHour);
                employeeList.add(new Employee(employeeName, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
