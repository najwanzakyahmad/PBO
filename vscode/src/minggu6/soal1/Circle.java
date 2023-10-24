package minggu6.soal1;

public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     * 
     * @param r
     */

    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    public Circle(double r, String colors) { // 2nd constructor
        radius = r;
        color = colors;
    }

    /**
     * Returns the radius
     * 
     * @return
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of this Circle instance
     * 
     * @return
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     * 
     * @return
     */

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
