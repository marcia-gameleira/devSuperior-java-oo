package aula_07.entities;

public class Triangle {
    
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double calcArea() {
        double perimeter = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(perimeter * (perimeter - ladoA)
                                   * (perimeter - ladoB)
                                   * (perimeter - ladoC)
                         );
    }

}
