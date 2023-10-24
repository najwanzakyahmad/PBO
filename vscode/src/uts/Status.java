package uts;

public class Status {
    private int code;
    private String description;

    // setter dan getter code
    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // setter dan getter description
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void status(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
