package aula_07.app;

import aula_07.entities.Triangle;

public class MainTriangle {

    public static void main(String[] args) {

        // Declaração
        Triangle x,y;
    
        // Instanciação
        x = new Triangle();
        y = new Triangle();
        
        x.ladoA = 3;
        x.ladoB = 4;
        x.ladoC = 5;

        y.ladoA = 7.5;
        y.ladoB = 4.5;
        y.ladoC = 4.02;

        System.out.printf("Área do triângulo X: %.2f%n", x.calcArea());
        System.out.printf("Área do triângulo X: %.2f%n", y.calcArea());
    }

}
