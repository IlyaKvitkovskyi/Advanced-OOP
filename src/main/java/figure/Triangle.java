package figure;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private Color color;

    public Triangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public float getHypotenuse() {
        return (float) Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public String draw() {
        return "Figure - Triangle" + ", area - " + getArea()
                + ", hypotenuse - " + getHypotenuse() + ", color - " + getColor();
    }

    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
