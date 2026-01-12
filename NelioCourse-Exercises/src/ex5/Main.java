package ex5;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("How Many dollars will be bought? ");
        double dollarsBought = scanner.nextDouble();
        scanner.nextLine();

        CurrencyConverter currencyConverter = new CurrencyConverter(dollarPrice, dollarsBought);

        System.out.printf("Amount to be paid in reais = %.2f%n", currencyConverter.dollarPurchase());

        scanner.close();
    }
}
