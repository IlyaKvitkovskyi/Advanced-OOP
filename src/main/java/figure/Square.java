package figure;

public class Square extends Figure {

    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawn square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure - Square" + ", area - " + getArea() +
                ", side - " + getSide() + ", color - " + getColor();
    }

    public double getSide() {
        return side;
    }
}
