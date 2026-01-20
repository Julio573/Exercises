package ex16;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Holder: ");
        String holder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = scanner.nextDouble();
        scanner.nextLine();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (NotEnoughBalanceException | WithdrawExceedsLimitsException e) {
            System.out.println(e.getMessage());
        }


        scanner.close();

    }
}
