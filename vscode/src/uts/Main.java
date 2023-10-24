package uts;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Delivery[] deliveries = gson.fromJson(new FileReader("data.json"), Delivery[].class);

            for (Delivery delivery : deliveries) {
                // Lakukan sesuatu dengan data pengiriman
                // Misalnya, tampilkan informasi pengiriman
                System.out.println("Status: " + delivery.getStatus().getDescription());
                System.out.println("Service Package: " +
                        delivery.getServicePackage().getService());
                System.out.println("Origin: " + delivery.getCity().getOriginal());
                System.out.println("Destination: " + delivery.getCity().getDestination());
                System.out.println("Weight: " + delivery.getWeight() + " kg");
                System.out.println("Quantity: " + delivery.getQuantity());
                System.out.println("Price Item: " + delivery.getPriceItem());
                System.out.println("Product Name: " + delivery.getProductName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}