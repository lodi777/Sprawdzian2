package pl.kurs.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB);
    }
}
