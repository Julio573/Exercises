package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ex2.Rectangle's width and height:");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("AREA = %.2f%n", rectangle.rectangleArea());
        System.out.printf("PERIMETER = %.2f%n", rectangle.rectanglePerimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.rectangleDiagonal());

        scanner.close();
    }
}
