package session17.challenges.streamevennumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,34,562,345,10,43,6,200,12,123);

        System.out.println(filterEvenNumbers(numbers));

    }

    private static List<Integer> filterEvenNumbers(List<Integer> input){

        return input.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

}
