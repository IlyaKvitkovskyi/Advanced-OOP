package figure;

public class Square extends Figure {

    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String draw() {
        return "Figure - Square" + ", area - " + getArea() +
                ", side - " + getSide() + ", color - " + getColor();
    }

    public double getArea() {
        return side * side;
    }

    public Color getColor() {
        return color;
    }
}
