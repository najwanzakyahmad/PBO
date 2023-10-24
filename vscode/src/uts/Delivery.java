package uts;

public class Delivery {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    // Konstruktor
    public Delivery(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceItem,
            String productName) {
        this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }

    // Metode getter
    public Status getStatus() {
        return status;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public City getCity() {
        return city;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public String getProductName() {
        return productName;
    }
}
