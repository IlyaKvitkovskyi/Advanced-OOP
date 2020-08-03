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
    public String draw() {
        return "Figure - Trapezoid" + ", area - " + getArea() + ", middle line - "
                + getMiddleLine() + ", height - " + getHeight() + ", color - " + getColor();
    }

    @Override
    public double getArea() {
        return middleLine * height;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public double getHeight() {
        return height;
    }
}
