package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee;
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.print("Enter the employee's id that will have a salary increase: ");
        int employeeId = scanner.nextInt();
        Integer position = findId(employeeList, employeeId);

        if (position == null) {
            System.out.println("Employee ID not found. Please try again!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            employeeList.get(position).salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee1 : employeeList) {
            System.out.println(employee1);
        }

        scanner.close();
    }
    public static Integer findId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

   
