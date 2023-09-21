package session16.challenges.touppercase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("alex","jon","devin","grump");

       StringsToUpperCase toUpperCase = (List<String> stringlist) -> {
           List<String> newList = new ArrayList<>(stringlist);
           newList.forEach(a -> newList.set(newList.indexOf(a), a.toUpperCase()));
           return newList;
       };

        System.out.println("Original: " + listOfNames);
        System.out.println("Updated: " + toUpperCase.toUpperCase(listOfNames));

    }
}
