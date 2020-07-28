package figure;

public class Trapezoid extends Figure {

    private double middleLine;
    private double height;
    private Color color;

    public Trapezoid(double middleLine, double height, Color color) {
        this.middleLine = middleLine;
        this.height = height;
        this.color = color;
    }

    public String draw() {
        return "Figure - Trapezoid" + ", area - " + getArea() + ", middle line - "
                + getMiddleLine() + ", height - " + getHeight() + ", color - " + getColor();
    }

    public double getArea() {
        return middleLine * height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public double getHeight() {
        return height;
    }
}
