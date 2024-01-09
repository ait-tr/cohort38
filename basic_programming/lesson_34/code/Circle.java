public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * this.radius);
    }
}
