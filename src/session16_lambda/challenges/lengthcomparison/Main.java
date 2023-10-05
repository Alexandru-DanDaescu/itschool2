package session16_lambda.challenges.lengthcomparison;


public class Main {

    public static void main(String[] args) {

        CompareLengthOfStrings compareLengthOfStrings = ((firstString, secondString) ->
                Integer.valueOf(firstString.length()).compareTo(Integer.valueOf(secondString.length())));

        System.out.println(compareLengthOfStrings.lengthComparison("Hard","Core"));  // -1 is false, 0 is true.
    }
}
