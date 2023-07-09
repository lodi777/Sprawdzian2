package pl.kurs.app;

import pl.kurs.models.Figure;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = {Figure.createSquare(100), Figure.createCircle(10), Figure.createRectangle(10, 20), Figure.createSquare(158)};
        for (Figure f : figures) {
            System.out.println(f);
        }
        Figure highestCircuit = figures[0];
        Figure highestSurface = figures[0];

        for (int i = 1; i < figures.length; i++) {
            if (figures[i].circuit() > highestCircuit.circuit()) {
                highestCircuit = figures[i];
            }

            if (figures[i].surface() > highestSurface.surface()) {
                highestSurface = figures[i];
            }
        }
        System.out.println("Figura z najwiekszym obwodem: " + highestCircuit);
        System.out.println("Figura z najwiekszym polem: " + highestSurface);
    }
}