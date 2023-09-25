package session17.challenges.largeststring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("test","gumboot","bootloader","shovel");

        System.out.println(getLargestWord(words));


    }

    private static List<String> getLargestWord(List<String> input){
        return input.stream()
                .max(Comparator.comparingInt(String::length))
                .stream().toList();

    }
}
