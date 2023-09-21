package session16.challenges.AlphabeticSortingAndReverseSorting;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("manic","red","violent","blue","flower","scrumptious");

        words.forEach(word -> Collections.sort(words));

        for(String word : words){
            System.out.print(word + " ");
        }

        System.out.println();
        words.forEach(word -> words.sort(Comparator.reverseOrder()));

        for(String word : words){
            System.out.print(word + " ");
        }


    }
}
