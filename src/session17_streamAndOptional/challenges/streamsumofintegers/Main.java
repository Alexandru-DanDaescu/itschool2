package session17_streamAndOptional.challenges.streamsumofintegers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};

        System.out.println(sumOfIntegers(numbers));

    }

    private static int sumOfIntegers(int[] arrayInput){
        IntStream sum = Arrays.stream(arrayInput);
        return sum.reduce(0, Integer::sum);
    }
}
