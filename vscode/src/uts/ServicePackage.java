package uts;

public class ServicePackage {
    private String service;
    private int value;

    // setter dan getter service
    public void setService(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    // setter dan getter value
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void servicePackage(String service, int value) {
        this.service = service;
        this.value = value;
    }
}
