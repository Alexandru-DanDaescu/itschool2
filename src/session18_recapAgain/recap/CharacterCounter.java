package session18_recapAgain.recap;


import java.util.Arrays;

public class CharacterCounter {

    public static void main(String[] args) {

        String sentence = "Around the world around the world";

        System.out.println(countWordsLongerThan(sentence,2));

    }

    private static int countWordsLongerThan(String input, int length){
       return (int) Arrays.stream(input.split(" "))
               .filter(word -> word.length() > length)
               .count();
    }
}
