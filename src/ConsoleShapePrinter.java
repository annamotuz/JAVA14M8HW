class ConsoleShapePrinter implements ShapePrinter {
    @Override
    public void printShape(Shape shape) {
        System.out.println("Shape name: " + shape.getName() + ", Color: " + shape.getColor() + ", Area: " + shape.getArea());
    }
}