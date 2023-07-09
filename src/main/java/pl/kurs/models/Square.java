package pl.kurs.models;

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

}
