package session16.challenges.lengthcomparison;


import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        CompareLengthOfStrings compareLengthOfStrings = ((firstString, secondString) ->
                Integer.valueOf(firstString.length()).compareTo(Integer.valueOf(secondString.length())));

        System.out.println(compareLengthOfStrings.lengthComparison("Hard","Core"));  // -1 is false, 0 is true.
    }
}
