package session16.challenges.genericitemfiltering;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        ListFilter<String> listFilter = (list, predicate) -> {
            List<String> filteredList = new ArrayList<>();
            for(String word : list){
                if(predicate.test(word)){
                    filteredList.add(word);
                }
            }
            return filteredList;
        };

        Predicate<String> greaterThanSeven = string -> string.length() > 7;

        List<String> randomWords = Arrays.asList("Hello","Something","Nuts","Randomizer","Substitute","Crush");

        System.out.println("Original list: " + randomWords);
        System.out.println("Updated list: " + listFilter.filterItems(randomWords,greaterThanSeven));

    }
}
