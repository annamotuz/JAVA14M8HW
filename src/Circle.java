class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void printFigureName() {
        System.out.println("Circle");
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}