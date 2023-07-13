class Triangle extends Shape {

    private double base;
    private double height;
    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public void printFigureName() {
        System.out.println("Triangle");
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}