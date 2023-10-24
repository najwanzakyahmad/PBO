package minggu6.soal2;

public class rectangle extends shape {
    private double width;
    private double length;

    public rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public rectangle(double w, double l) {
        super();
        this.width = w;
        this.length = l;
    }

    public rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        this.width = w;
        this.length = l;

    }

    public void setlength(double length) {
        this.length = length;
    }

    public double getlength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width : " + width + " and length : " + length + ", which is a subclass of "
                + super.toString();
    }

}
