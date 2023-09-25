package session17.challenges.voweloccurrences;



public class Main {

    public static void main(String[] args) {

        String occurrenceTester = "Hello, my name is Helmut. I am trying to go home.";

        System.out.println(vowelOccurrencesCounter(occurrenceTester));
    }

    private static long vowelOccurrencesCounter(String input){
        return input.chars()
                .filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'u'))
                .count();

    }
}
