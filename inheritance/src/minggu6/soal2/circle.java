package minggu6.soal2;

public class circle extends shape {
    private double radius;

    public circle() {
        super();
        this.radius = 1.0;
    }

    public circle(double r) {
        super();
        this.radius = r;
    }

    public circle(double r, String c, Boolean f) {
        super(c, f);
        this.radius = r;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius + " which is a subclass of " + super.toString();
    }

}
