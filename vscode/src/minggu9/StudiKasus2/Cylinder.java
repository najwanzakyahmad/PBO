package minggu9.StudiKasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + " (Radius: " + radius + ", Height: " + height + ")";
    }
}
