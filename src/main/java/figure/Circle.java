package figure;

public class Circle extends Figure {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawn circle");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "figure.Figure - figure.Circle" + ", area - " + getArea() + ", radius - "
                + getRadius() + ", color - " + getColor();
    }

    public double getRadius() {
        return radius;
    }
}
