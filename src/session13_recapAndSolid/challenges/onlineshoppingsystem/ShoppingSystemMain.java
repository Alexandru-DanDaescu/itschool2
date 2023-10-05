package session13_recapAndSolid.challenges.onlineshoppingsystem;

public class ShoppingSystemMain {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.addProduct(new Product("Shelf", "Ikea shelf", 2343.12, 3));

        Customer customer1 = new Customer("Michael", "michael@gmail.com", "Insert street here", "Insert billing address here");

        shop.addCustomer(customer1);

        customer1.setCustomerCredit(3000.23);
        customer1.addProductToOrder(shop.geProductName("Shelf"));


    }
}
