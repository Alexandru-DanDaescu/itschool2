package session17.challenges.transformstrings;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("song","wrong","vehicle","occurrence");

        System.out.println(findLongestString(listOfStrings));
    }

    private static List<Integer> findLongestString(List<String> input){

        return input.stream()
                .map(String::length)
                .toList();
    }

}
