package pl.pjatk.shopee_s26407;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private int id;
    private double balance;

    public Customer(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setSaldo(double saldo) {
        this.balance = saldo;
    }
}
