package ex2;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getArea() {
        return 0.5 * base * height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "base=" + base +
//                ", height=" + height +
//                '}';
//    }
}
