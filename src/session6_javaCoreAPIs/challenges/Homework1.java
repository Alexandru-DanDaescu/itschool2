package session6_javaCoreAPIs.challenges;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {

//  1. Reverse a String
//  Description: Use the StringBuilder class to write a program that reverses an input string.
//  For example, the input "hello" should return "olleh".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything that you wish to be reversed.");
        String input = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder(input);

        System.out.println(stringBuilder.reverse());

//  2. Palindrome Checker
//  Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
//  A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

        System.out.println("Enter anything to check whether it's palindrome or not (examples of palindrome strings : abba, ceec)");

        String palindromeInput = sc.nextLine();
        System.out.println(palindromeChecker(palindromeInput) ? "is palindrome" : "is not palindrome");

//  3. Concatenate Multiple Strings
//  Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.


        List<String> stringList = new ArrayList<>();
        StringBuilder stringBuilder2 = new StringBuilder();


        System.out.println("Enter 10 words to concatenate");
        System.out.println(concatenateListOfStrings(stringList, stringBuilder2)); //I am unsure of how to remove the brackets that appear.


//  4. Removing Vowels
//  Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.


        System.out.println("Enter words with vowels.");
        String input2 = sc.nextLine();
        StringBuilder stringBuilder3 = removeVowels(input2);
        System.out.println(stringBuilder3);


//  5. Word Capitalizer
//  Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.

        String sentence = "Hello i am doing something here";
        StringBuilder stringBuilder4 = new StringBuilder();

        String[] words = sentence.split("\\s"); //Ask what this does.

        for (String index : words) {
            if (!sentence.equals("")) {
                stringBuilder4.append(Character.toUpperCase(index.charAt(0)));
                stringBuilder4.append(index.substring(1));
            }
            stringBuilder4.append(" ");
        }
        System.out.println(stringBuilder4.toString().trim());


    }


    //  2.
    public static boolean palindromeChecker(String string) {

        StringBuilder palindrome = new StringBuilder(string);
        palindrome.reverse();

        String reverse = palindrome.toString();

        return reverse.equals(string) ? true : false;
    }

    //  3.
    public static String concatenateListOfStrings(List<String> stringList, StringBuilder stringBuilder) {
        Scanner sc = new Scanner(System.in);

        stringList = new ArrayList<>();

        stringBuilder = new StringBuilder(String.valueOf(stringList));
        //we need to add String.valueOf() to our StringBuilder
        //because our StringBuilder demands string variables.
        //Basically, we convert a list to a string (from what I understand).

        String result = "";

        for (int i = 0; i < 10; i++) {
            stringList.add(sc.next());
            result = String.valueOf(stringBuilder
                    .append(stringList.get(i))
                    .append(" "));

        }

        return result;
    }

    //  4.
    public static StringBuilder removeVowels(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (char c : input.toCharArray()) {
            if (!vowels.contains(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }

}
