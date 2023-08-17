package session6.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//   6. String Replacement
//   Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
//   For instance, replace "cat" with "dog" in the string "The cat sat on the mat."


        StringBuilder stringBuilder = new StringBuilder("The cat sat on the mat");

        stringBuilder.replace(4, 7, "dog");

        System.out.println(stringBuilder);

//  7. Duplicate Character Remover
//  Description: Design a program using StringBuilder that removes duplicate characters from a string.
//  For example, "balloon" should become "balon".


        System.out.println("Enter words with a maximum of two duplicate characters");

        String userInput = scanner.nextLine();

        StringBuilder duplicateRemover = new StringBuilder(userInput);


        for (int i = 0; i < userInput.length() - 1; i++) {
            if (userInput.charAt(i) == userInput.charAt(i + 1)) {
                duplicateRemover.deleteCharAt(i);
            }
        }

        System.out.println(duplicateRemover);


//  8. Inserting at Index
//  Description: Write a Java program that inserts a given string into another string
//  at a specified index using the StringBuilder class.

        String string1 = "We are doing fine today";
        String string2 = "not";

        StringBuilder insertString = new StringBuilder(string1);

        insertString.insert(6, " " + string2 + " ");

        System.out.println(insertString);

//  9. Frequency Counter
//  Description: Using StringBuilder, write a program that counts the frequency of each character in a string.


        StringBuilder stringBuilder2 = new StringBuilder("Character frequency tester.");
        int count = 0;
        for (int i = 0; i < stringBuilder2.length(); i++) {
            if (stringBuilder2.charAt(i) == 'a' || stringBuilder2.charAt(i) == 'e' || stringBuilder2.charAt(i) == 'r') {
                count++;
            }
        }
        System.out.println("The amount of frequencies we have are : " + count);


//  12. CamelCase to Snake_case Converter
//  Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case.
//  For instance, "thisIsCamelCase" would become "this_is_camel_case".

        String camelCase = "thisIsCamelCase";

        StringBuilder stringBuilder3 = new StringBuilder(camelCase.toLowerCase());

        stringBuilder3.insert(4, "_");
        stringBuilder3.insert(7, "_");
        stringBuilder3.insert(13, "_");


        System.out.println(stringBuilder3);

//  13. Expand Compressed Strings
//  Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the StringBuilder class.

        String text = "a3b2c4";

        StringBuilder stringBuilder4 = new StringBuilder(text);

        stringBuilder4.replace(0, 2, "aaa");
        stringBuilder4.replace(3, 5, "bb");
        stringBuilder4.replace(5, 7, "cccc");

        System.out.println(stringBuilder4);

    }


}


//Please ignore this. I was testing out the code to see how it works.
 /*
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
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

        for(char c : input.toCharArray()){
            System.out.println("BEFORE : "+c);
            if(!vowels.contains(c)){
                stringBuilder.append(c);
            }
            System.out.println("AFTER : "+stringBuilder);
        }

         */