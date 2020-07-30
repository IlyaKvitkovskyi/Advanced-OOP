package figure;

public enum Color {

    YELLOW("yellow"),
    RED("red"),
    BLACK("black"),
    WHITE("white"),
    BLUE("blue");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
