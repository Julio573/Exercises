package ex18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A:");
        int numberA = scanner.nextInt();

        for (int i = 0; i < numberA; i++) {
            int n1 = scanner.nextInt();
            courseA.add(n1);
        }

        System.out.print("How many students for course B:");
        int numberB = scanner.nextInt();

        for (int i = 0; i < numberB; i++) {
            int n1 = scanner.nextInt();
            courseB.add(n1);
        }

        System.out.print("How many students for course C:");
        int numberC = scanner.nextInt();

        for (int i = 0; i < numberC; i++) {
            int n1 = scanner.nextInt();
            courseC.add(n1);
        }

        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total students: " + total.size());

        scanner.close();
    }
}
