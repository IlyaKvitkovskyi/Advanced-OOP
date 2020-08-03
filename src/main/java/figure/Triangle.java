package figure;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Color color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String draw() {
        return "Figure - Triangle" + ", area - " + getArea()
                + ", sides - " + sideA + ", " + sideB + ", " + sideC + ", color - " + getColor();
    }

    public double getArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}
