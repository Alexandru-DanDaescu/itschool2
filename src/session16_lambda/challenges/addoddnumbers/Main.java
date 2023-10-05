package session16_lambda.challenges.addoddnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        OriginalList originalList = (List<Integer> integerList) -> {
            List<Integer> newList = new ArrayList<>();
            for (int number : integerList) {
                if (number % 2 == 1) {
                    newList.add(number);
                }
            }
            return newList;
        };

        System.out.println("Original list: " + integers);
        System.out.println("Updated list: " + originalList.addOddNumbersToList(integers));


    }
}
