package figure;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;

    public Triangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Drawn triangle");
    }

    @Override
    public String toString() {
        return "figure.Figure - figure.Triangle" + ", area - " + getArea()
                + ", hypotenuse - " + getHypotenuse() + ", color - " + getColor();
    }

    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    public float getHypotenuse() {
        return (float) Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}




