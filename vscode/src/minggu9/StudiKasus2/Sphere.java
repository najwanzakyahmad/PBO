package minggu9.StudiKasus2;

// Sphere.java
// Represents a sphere.
public class Sphere extends Shape
{
    private double radius; //radius in feet
    // Constructor: Sets up the sphere.
    public Sphere (String shapeName, double r)
    {
        super(shapeName);
        radius = r;
    }

    @Override
    // Returns the surface area of the sphere.
    public double area()
    {
        return 4*Math.PI * radius * radius;
    }
    
    @Override
    //return sphere as a string
    public String toString()
    {
        return super.toString() + " of radius " + radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}