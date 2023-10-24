package minggu6.soal2;

public class shape {
    /**
     *
     */
    private String color;
    private boolean filled;

    public shape() {
        this.color = "green";
        this.filled = true;
    }

    public shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color " + color + " and filled " + filled;
    }
}
