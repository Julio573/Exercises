package ex10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String level = String.valueOf(WorkerLevel.valueOf(scanner.nextLine()));
        System.out.print("Base Salary: ");
        double salary = scanner.nextDouble();

         Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), salary, new Department(departmentName));

        System.out.println();
        System.out.print("How many contracts to this worker: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract " + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Duration (hours): ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            worker.addContract(new HourContract(date, valuePerHour, duration));
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getWorkerName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for: %s: %.2f%n", monthAndYear, worker.income(month, year));

        scanner.close();
    }
}
