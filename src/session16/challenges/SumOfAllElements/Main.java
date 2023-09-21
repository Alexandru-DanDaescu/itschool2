package session16.challenges.SumOfAllElements;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(23, 543, 12, 56, 324, 67);

        int sum = listOfNumbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

    }
}
