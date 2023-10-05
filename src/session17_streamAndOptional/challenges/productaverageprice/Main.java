package session17_streamAndOptional.challenges.productaverageprice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Skateboard","Entertainment",200.00),
                new Product("Jewelry","Apparel",1340.62),
                new Product("PC Monitor","Electronics",763.12),
                new Product("Winter Boots","Apparel",130.42));

        Map<String,Double> highest = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));

        Optional<Map.Entry<String,Double>> category = highest.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Category: " + category.get().getKey() + " Price: " + category.get().getValue());

    }


}
