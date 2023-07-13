class Quadrilateral extends Shape {

    private double side;

    public Quadrilateral(double side) {
        super("Quadrilateral");
        this.side = side;
    }

    @Override
    public void printFigureName() {
        System.out.println("Quadrilateral");
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}