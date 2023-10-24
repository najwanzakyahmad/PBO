package minggu9.StudiKasus2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " (Length: " + length + ", Width: " + width + ")";
    }
}
