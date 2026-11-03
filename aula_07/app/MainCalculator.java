package aula_07.app;

import java.util.Locale;
import java.util.Scanner;

import aula_07.entities.Calculator;

public class MainCalculator {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }
}
