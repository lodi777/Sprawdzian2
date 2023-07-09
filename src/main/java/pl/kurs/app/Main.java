package pl.kurs.app;

import pl.kurs.models.Figure;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = {Figure.createSquare(10), Figure.createCircle(10), Figure.createRectangle(10, 20), Figure.createSquare(15)};
        for (Figure f : figures) {
            System.out.println(f);
        }
    }
}