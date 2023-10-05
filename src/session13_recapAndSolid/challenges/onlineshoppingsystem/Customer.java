package session13_recapAndSolid.challenges.onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {


    private String clientName;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private List<Order> orders;
    private Order currentOrder;
    private Shop shop;
    private double customerCredit;


    public Customer(String clientName, String email, String shippingAddress, String billingAddress) {
        this.clientName = clientName;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        orders = new ArrayList<>();
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setCustomerCredit(double customerCredit) {
        this.customerCredit = customerCredit;
    }

    public void addProductToOrder(Product product) {
        if (currentOrder == null) {
            currentOrder = new Order(this);
        }
        if (shop.productIsInStock()) {
            currentOrder.addToOrder(product);
        }

    }


}
