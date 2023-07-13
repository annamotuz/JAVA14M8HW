abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printFigureName();

    public abstract Color getColor();

    public abstract double getArea();
}
