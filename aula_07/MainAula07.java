package aula_07;

import aula_07.entities.Triangle;

public class MainAula07 {

    public static void main(String[] args) {

        // Declaração
        Triangle x, y;
    
        // Instanciação
        x = new Triangle();
        y = new Triangle();
        
        x.ladoA = 3;
        x.ladoB = 4;
        x.ladoC = 5;

        System.out.println(x.ladoA);
    }

}
