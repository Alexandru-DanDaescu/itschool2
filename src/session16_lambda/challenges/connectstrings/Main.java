package session16_lambda.challenges.connectstrings;

public class Main {

    public static void main(String[] args) {

        JoinTwoStrings strings = ((firstString, secondString) -> firstString.concat(" ").concat(secondString));

        System.out.println(strings.concatenateStrings("Hello","flower!"));


    }
}
