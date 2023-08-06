package pl.kurs.app;

import pl.kurs.exceptions.IllegalValueException;
import pl.kurs.models.Figure;

    public class Main {
        public static void main(String[] args) {

            try {
                Figure[] figures = {Figure.createSquare(10), Figure.createCircle(10), Figure.createRectangle(10, 20), Figure.createSquare(15)};
                for (Figure f : figures) {
                    System.out.println(f);
                }

                Figure figureWithHighestCircuit = Figure.findFigureWithHighestCircuit(figures);
                Figure figureWithHighestSurface = Figure.findFigureWithHighestSurface(figures);

                System.out.println("Figura z najwiekszym obwodem: " + figureWithHighestCircuit.figureDescription());
                System.out.println("Figura z najwiekszym polem: " + figureWithHighestSurface.figureDescription());

                for (Figure f : figures) {
                    if(f.equals(Figure.createRectangle(10, 20))) {
                        System.out.println(f.hashCode() + " " + Figure.createRectangle(10,20).hashCode());
                    } else if (f.equals(Figure.createCircle(10))) {
                        System.out.println(f.hashCode() + " " + Figure.createCircle(10).hashCode());

                    }
                }
            } catch (IllegalValueException e) {
                System.out.println("Błąd podczas tworzenia figury: " + e.getMessage());
            }
        }
    }


