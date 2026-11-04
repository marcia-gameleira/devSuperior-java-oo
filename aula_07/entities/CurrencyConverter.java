package aula_07.entities;

public class CurrencyConverter {

    // IOF = 3,5% para compras internacionais em 03/11/2026.
    private static final double IOF = 1.035;

    public static double dollarToReal(double dollarPrice, double dollars) {
        return dollarPrice * dollars * (1.0 + IOF);
    }
}
