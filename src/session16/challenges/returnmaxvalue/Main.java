package session16.challenges.returnmaxvalue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MaxValue value = input -> !input.isEmpty() ?   input.stream()
                                                            .max((x,y) -> x.compareTo(y)) : java.util.Optional.empty();

        System.out.println(value.maxValue(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }
}
