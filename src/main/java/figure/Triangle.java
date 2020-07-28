package figure;

public class Triangle extends Figure {

    private double side1;
    private double side2;
    private Color color;

    public Triangle(double side1, double side2, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public float getHypotenuse() {
        return (float) Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public String draw() {
        return "Figure - Triangle" + ", area - " + getArea()
                + ", hypotenuse - " + getHypotenuse() + ", color - " + getColor();
    }

    public double getArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
