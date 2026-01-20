package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Grade1: ");
        double grade1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Grade2: ");
        double grade2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Grade3: ");
        double grade3 = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.printf("Final Grade = %.2f%n", student.finalGrade());
        student.finalResult();

        scanner.close();
    }
}
