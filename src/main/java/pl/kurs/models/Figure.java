package pl.kurs.models;

import pl.kurs.exceptions.IllegalValueException;

import java.util.Objects;

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

    public static Square createSquare(double side) throws IllegalValueException {
        if (side <= 0) {
            throw new IllegalValueException("Długość boku nie może być ujemna!");
        }
        return new Square(side);
    }

    public static Circle createCircle(double radius) throws IllegalValueException {
        if (radius <=0) {
            throw new IllegalValueException("Promień nie może być mniejszy lub równy 0!");
        }
        return new Circle(radius);
    }

    public static Rectangle createRectangle(double sideA, double sideB) throws IllegalValueException {
        if (sideA <= 0 || sideB <= 0) {
            throw new IllegalValueException("Długość boku nie może być ujemna!");
        }
        return new Rectangle(sideA, sideB);
    }

    public static Figure findFigureWithHighestCircuit(Figure[] figures) {
        Figure figureWithHighestCircuit = null;
        double maxCircuit = Double.MIN_VALUE;

        for (Figure figure : figures) {
            double circuit = figure.circuit();
            if (circuit > maxCircuit) {
                maxCircuit = circuit;
                figureWithHighestCircuit = figure;
            }
        }
        return figureWithHighestCircuit;
    }

    public static Figure findFigureWithHighestSurface(Figure[] figures) {
        Figure figureWithHighestSurface = null;
        double maxSurface = Double.MIN_VALUE;

        for (Figure figure : figures) {
            double surface = figure.surface();
            if (surface > maxSurface) {
                maxSurface = surface;
                figureWithHighestSurface = figure;
            }
        }
        return figureWithHighestSurface;
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
        return Double.compare(surface(), figure.surface()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface());
    }
}

