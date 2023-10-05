package session17_streamAndOptional.challenges.convertstringstoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1","2","3","4","5");

        List<Integer> product = Collections.singletonList(numbers.stream()
                .mapToInt(Integer::parseInt)
                        .reduce(1,(a,b) -> a * b));

        System.out.println(product);

    }
}
