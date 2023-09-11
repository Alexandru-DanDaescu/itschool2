package session13.challenges.onlineshoppingsystem;

import session10.challenges.bankaccountmanagementsystem.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

    private Customer customer;
    private UUID orderNumber;
    private List<Product> products;


    public Order(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();

    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToOrder(Product product) {
        products.add(product);
    }

    public double getSumOfOrderedProducts() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getItemPrice();
        }
        return sum;
    }


}
