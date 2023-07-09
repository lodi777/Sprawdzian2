package pl.kurs.models;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;


    }

    @Override
    public double surface() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String figureDescription() {
        return ": Koło o promieniu " + radius + ".";
    }

}
