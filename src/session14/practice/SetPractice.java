package session14.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products = initializeSet();

        displayProducts(products);

        Set<String> products2 = initializeSet();
        products2.add("P103");
        products2.add("P104");

        mergeProducts(products,products2);

    }

    private static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100"); // Product 100
        products.add("P101");
        products.add("P102");

        return products;
    }

    private static void displayProducts(Set<String> products){
        for(String product : products){
            System.out.println(product);
        }
    }

    private static Set<String> mergeProducts(Set<String> firstSet, Set<String> secondSet){
        Set<String> result = new HashSet<>();
        //result.addAll();
        return null;
    }

}