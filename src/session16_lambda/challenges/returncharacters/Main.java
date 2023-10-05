package session16_lambda.challenges.returncharacters;

public class Main {

    public static void main(String[] args) {

        ReturnFirstCharacters firstCharacters = ((input, numberOfCharacters) -> numberOfCharacters > input.length() ?
                input : input.substring(0,numberOfCharacters));

        System.out.println(firstCharacters.returnCharacter("Alex",6));


    }
}
