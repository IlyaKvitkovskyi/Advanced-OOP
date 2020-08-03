package figure;

public abstract class Figure {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract String draw();

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
