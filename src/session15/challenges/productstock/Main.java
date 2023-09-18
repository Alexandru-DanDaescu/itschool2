package session15.challenges.productstock;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId("Am");

        Product product2 = new Product();
        product2.setId("Am");

        System.out.println(product1.equals(product2));

        System.out.println("Product1: " + product1.hashCode());
        System.out.println("Product2: " + product2.hashCode());

        product1.setId("Hello"); //changing product ID

        System.out.println(product1.equals(product2));

        System.out.println("Product1: " + product1.hashCode());
        System.out.println("Product2: " + product2.hashCode());


    }
}
