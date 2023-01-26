package pl.pjatk.shopee_s26407;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private final Customer customer;
    private ShopStorage shopStorage;
    private double shoppingSum = 0;

    private List<String> carItems = new ArrayList<>();

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public void addItemToCar(String itemName) {
        carItems.add(itemName);
        shoppingSum =+ shopStorage.getPriceByName(itemName);
    }

    public List<String> getItemList() {
        return carItems;
    }

    public double getShoppingSum() {
        return shoppingSum;
    }

    public Customer getCustomer() {
        return customer;
    }
}
