package Moduuli8;

public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
