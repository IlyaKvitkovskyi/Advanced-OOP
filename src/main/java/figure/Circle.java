package figure;

public class Circle extends Figure {

    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public String draw() {
        return "Figure - Circle" + ", area - " + getArea() + ", radius - "
                + getRadius() + ", color - " + getColor();
    }

    public double getArea() {
        return Math.pow((Math.PI * radius), 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
