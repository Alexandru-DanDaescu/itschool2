package session17_streamAndOptional.challenges.wordoccurrences;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {


        List<String> sentences = Arrays.asList("Hello world", "Hello everyone", "Welcome to the world of java"
                ,"Around the world","Getting along with everyone","No stipulations here");

        String occurringWord = sentences.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElse("");

        System.out.println(occurringWord);

    }


}
