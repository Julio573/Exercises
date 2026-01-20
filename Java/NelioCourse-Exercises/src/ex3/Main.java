package ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Tax: ");
        double tax = scanner.nextDouble();
        scanner.nextLine();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        scanner.close();
    }
}
