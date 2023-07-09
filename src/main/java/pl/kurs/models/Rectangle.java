package pl.kurs.models;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double surface() {
        return sideA * sideB;
    }

    @Override
    public double circuit() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String figureDescription() {
        return ": Prostokąt o bokach " + sideA + "x" + sideB + ".";
    }

}
