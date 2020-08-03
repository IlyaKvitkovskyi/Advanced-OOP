package service;

import figure.Circle;
import figure.Figure;
import figure.Triangle;
import figure.Trapezoid;
import figure.Square;
import figure.Color;
import java.util.Random;

public class FigureService {

    private static final int COUNT_OF_SHAPE_TYPE = (int) (Math.random() * 4);

    public void print() {

        int size = (int) (Math.random() * 10);
        Figure[] figures = new Figure[size];
        for (int i = 0; i < size; i++) {
            figures[i] = generateRandomFigure();
            System.out.println(figures[i]);
        }
    }

    private static Figure generateRandomFigure() {

        switch (COUNT_OF_SHAPE_TYPE) {
            case 0:
                return new Square(generateRandomColor(), generateSizeOfSide());
            case 1:
                return new Triangle(generateRandomColor(), generateSizeOfSide(), generateSizeOfSide(), generateSizeOfSide());
            case 2:
                return new Circle(generateRandomColor(), generateSizeOfSide());
            default:
                return new Trapezoid(generateRandomColor(), generateSizeOfSide(),
                        generateSizeOfSide());
        }
    }

    private static Color generateRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    private static double generateSizeOfSide() {
        return Math.random() * 10;
    }
}
