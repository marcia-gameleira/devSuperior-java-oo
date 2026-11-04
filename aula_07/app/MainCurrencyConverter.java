package aula_07.app;

import java.util.Locale;
import java.util.Scanner;

import aula_07.entities.CurrencyConverter;

public class MainCurrencyConverter {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = scanner.nextDouble();

        double amount = CurrencyConverter.dollarToReal(dollarPrice, dollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", amount);

        scanner.close();
    }
}
