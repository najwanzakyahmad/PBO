package uts;

public class City {
    private String original;
    private String destination;

    // setter dan getter original
    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginal() {
        return original;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void city(String original, String destination) {
        this.original = original;
        this.destination = destination;
    }
}
