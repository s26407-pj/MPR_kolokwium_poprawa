package pl.pjatk.shopee_s26407;

import org.springframework.stereotype.Component;

public class Items {
    private String itemName;
    private double price;

    public Items(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice(String itemName) {
        return price;
    }
}
