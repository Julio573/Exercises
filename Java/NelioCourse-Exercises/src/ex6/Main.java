package ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Is there an initial deposito (y/n): ");
        char option = scanner.nextLine().toUpperCase().charAt(0);

        if (option == 'Y') {
            System.out.print("Enter the deposit value: ");
            double initialDeposit = scanner.nextDouble();
            scanner.nextLine();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine();
        bankAccount.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        scanner.nextLine();
        bankAccount.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        scanner.close();

    }
}
