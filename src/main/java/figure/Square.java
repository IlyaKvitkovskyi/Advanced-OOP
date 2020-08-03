package figure;

public class Square extends Figure {

    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure - Square" + ", area - " + getArea() +
                ", side - " + getSide() + ", color - " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
