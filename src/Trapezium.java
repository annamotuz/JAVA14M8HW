class Trapezium extends Shape {
    private double top;
    private double bottom;
    private double height;

    public Trapezium(double top, double bottom, double height) {
        super("Trapezium");
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void printFigureName() {
        System.out.println("Trapezium");
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    @Override
    public double getArea() {
        return 0.5 * (top + bottom) * height;
    }
}
