package ex2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public double getArea() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
