class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void printFigureName() {
        System.out.println("Rectangle");
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}