package minggu6.soal2;

public class square extends rectangle {

    public square() {
        super();
    }

    public square(double side) {
        super(side, side);
    }

    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.setlength(side);
    }

    public double getSide() {
        return this.getlength();
        // karena square(persegi) itu panjang dan lebarnya sama, maka cukup salah
        // satunya yang disebut
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setlength(double side) {
        super.setlength(side);
    }

    public String toString() {
        return "A Square with side : " + getSide() + " luas : " + getArea() + " keliling : " + getPerimeter()
                + ", which is a subclass of : " + super.toString();
    }
}
