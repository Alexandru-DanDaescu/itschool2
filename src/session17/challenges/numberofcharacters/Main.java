package session17.challenges.numberofcharacters;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        System.out.println(filterWhiteSpaces(stringList));

    }

    private static long filterWhiteSpaces(List<String> input){
        return input.stream()
                .flatMapToInt(String::codePoints) //this is needed in order to parse the string to an integer
                .filter(e -> !Character.isWhitespace(e))
                .count();
    }

}
