class CircleHasAPoint {
    private Point center;
    private double radius;

    public CircleHasAPoint() {}
    public CircleHasAPoint(Point p, double r) {
        center = p;
        this.radius = r;
    }
    public CircleHasAPoint(int x, int y, double r) {
        center = new Point(x, y);
        this.radius = r;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}

public class TestCircleHasAPoint {
}
