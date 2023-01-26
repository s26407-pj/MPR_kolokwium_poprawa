package pl.pjatk.shopee_s26407;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopService {
    private final ShopStorage shopStorage;
    private final Cart cart;

    private double shoppingSum = 0;

    public ShopService(ShopStorage shopStorage, Cart cart) {
        this.shopStorage = shopStorage;
        this.cart = cart;
    }

    public List<String> getAllItemsFromCart() {
        return cart.getItemList();
    }

    public void orderItems(Cart cart) {
        Customer customer = cart.getCustomer();
        double customerSaldo = cart.getCustomer().getBalance();
        double shoppingSum = cart.getShoppingSum();

        if(customerSaldo >= shoppingSum) {
            double saldo = customerSaldo - shoppingSum;
            customer.setSaldo(saldo);
            System.out.println("Transakcja zaakceptowana. Cena zakupów: " + shoppingSum + ", pozostałe saldo: " + saldo);
        }
    }
}
