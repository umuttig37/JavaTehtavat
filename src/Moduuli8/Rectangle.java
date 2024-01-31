package Moduuli8;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
