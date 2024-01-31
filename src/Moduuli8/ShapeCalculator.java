package Moduuli8;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0, "Red");
        shapes[1] = new Rectangle(4.0, 6.0, "Blue");
        shapes[2] = new Triangle(3.0, 8.0, "Green");

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area of " + circle.color + " Circle with radius " + circle.radius + ": " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area of " + rectangle.color + " Rectangle with width " + rectangle.width + " and height " + rectangle.height + ": " + shape.calculateArea());
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("Area of " + triangle.color + " Triangle with base " + triangle.base + " and height " + triangle.height + ": " + shape.calculateArea());
            }
        }
    }
}

