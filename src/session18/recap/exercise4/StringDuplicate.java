package session18.recap.exercise4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicate {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple","apple","plum","orange");

        System.out.println(countStringDuplicates(list));

    }
    private static HashMap<String, Long> countStringDuplicates(List<String> input){
        return (HashMap<String, Long>) input.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }
}
