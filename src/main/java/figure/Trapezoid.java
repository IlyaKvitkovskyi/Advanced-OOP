package figure;

public class Trapezoid extends Figure {

    private double middleLine;
    private double height;

    public Trapezoid(Color color, double middleLine, double height) {
        super(color);
        this.middleLine = middleLine;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawn trapezoid");
    }

    @Override
    public double getArea() {
        return middleLine * height;
    }

    @Override
    public String toString() {
        return "figure.Figure - figure.Trapezoid" + ", area - " + getArea() + ", middle line - "
                + getMiddleLine() + ", height - " + getHeight() + ", color - " + getColor();
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public double getHeight() {
        return height;
    }
}
