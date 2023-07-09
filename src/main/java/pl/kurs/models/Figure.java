package pl.kurs.models;

public abstract class Figure {
    public abstract double surface();

    public abstract double circuit();

    public abstract String figureDescription();

    private static int counter;
    private int number;

    public Figure() {
        counter++;
        number = counter;
    }

    public static Square createSquare(double side) {
        return new Square(side);
    }

    public static Circle createCircle(double radius) {
        return new Circle(radius);
    }

    public static Rectangle createRectangle(double sideA, double sideB) {
        return new Rectangle(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Figura nr " + number + figureDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Figure figure = (Figure) o;
        return true;
    }
}
