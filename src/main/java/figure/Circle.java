package figure;

public class Circle extends Figure {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure - Circle" + ", area - " + getArea() + ", radius - "
                + getRadius() + ", color - " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
