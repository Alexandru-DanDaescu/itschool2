package session13_recapAndSolid.challenges.onlineshoppingsystem;

public class Product {

    private String productName;
    private String productDescription;
    private double itemPrice;
    private int itemQuantity;

    public Product(String productName, String productDescription, double itemPrice, int itemQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
