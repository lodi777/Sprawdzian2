package pl.kurs.models;

import java.util.Objects;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double surface() {
        return side * side;
    }

    @Override
    public double circuit() {
        return 4 * side;
    }

    @Override
    public String figureDescription() {
        return ": Kwadrat o boku " + side + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
