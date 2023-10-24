package minggu9.StudiKasus2;

public class Paint 
{
    private double coverage;    

    public Paint (double c)
    {
        this.coverage = c;
    }

    public double amount(Shape s)
    {
        double area = s.area();
        System.out.println("Coverage " + s + " : " + coverage);
        System.out.println("Area " + s + " : " + area);
        return area / coverage;
    }
}

