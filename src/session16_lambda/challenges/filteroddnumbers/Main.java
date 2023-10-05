package session16_lambda.challenges.filteroddnumbers;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        arrayOfNumbers.stream()
                .filter(array -> array % 2 == 0)
                .forEach(System.out::println);



    }
}
