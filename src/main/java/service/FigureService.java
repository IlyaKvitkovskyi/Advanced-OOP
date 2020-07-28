package service;

import figure.*;

public class FigureService {

    int size = (int)(Math.random()*10);
    Figure[] figures = new Figure[size];

    public void generateRandomFigure(){
        for(int i = 0; i < size; i++) {
            int random = (int)(Math.random()*4);
            switch (random) {
                case 0:
                    figures[i] = new Triangle(generateSizeOfSide(), generateSizeOfSide(), generateRandomColor());
                    break;
                case 1:
                    figures[i] = new Trapezoid(generateSizeOfSide(), generateSizeOfSide(), generateRandomColor());
                    break;
                case 2:
                    figures[i] = new Circle( generateSizeOfSide(), generateRandomColor());
                    break;
                case 3:
                    figures[i] = new Square(generateSizeOfSide(), generateRandomColor());
                    break;
            }
        }
    }

    public double generateSizeOfSide(){
        return Math.random() * 10;
    }

    public Color generateRandomColor(){
        int random = (int)(Math.random() * 5);
        switch (random) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.BLACK;
            case 3:
                return Color.WHITE;
            case 6:
                return Color.YELLOW;
        }
        return generateRandomColor();
    }

    public void print(){
        for(Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}
