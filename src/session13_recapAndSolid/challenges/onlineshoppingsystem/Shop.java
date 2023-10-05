package session13_recapAndSolid.challenges.onlineshoppingsystem;

import java.util.List;
import java.util.ArrayList;

public class Shop {


    private List<Product> productList;
    private List<Customer> customers;

    public Shop() {
        productList = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> productList() {
        return productList;
    }

    public void processOrder(Order order, Customer customer) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : order.getProducts()) {
            stringBuilder.append(" ").append(product.getProductName());
        }
        System.out.println("The products: " + stringBuilder + " are on the way to the customer." +
                "\nCustomer name:" + customer.getClientName() +
                "\nCustomer shipping address: " + customer.getShippingAddress());
    }

    public Product geProductName(String nameOfProduct) {
        for (Product product : productList) {
            if (product.getProductName().equals(nameOfProduct)) {
                return product;
            }
        }
        return null;
    }


    public boolean productIsInStock() {
        for (Product product : productList) {
            if (productList.contains(product) && product.getItemQuantity() > 0) {
                return true;
            }
        }
        return false;
    }


}
