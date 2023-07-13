public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(4, 6);
        Shape quadrilateral = new Quadrilateral(3);
        Shape trapezium = new Trapezium(2, 5, 4);
        Shape rectangle = new Rectangle(4, 8);

        ConsoleShapePrinter shapePrinter = new ConsoleShapePrinter();
        shapePrinter.printShape(circle);
        shapePrinter.printShape(triangle);
        shapePrinter.printShape(quadrilateral);
        shapePrinter.printShape(trapezium);
        shapePrinter.printShape(rectangle);
    }
}