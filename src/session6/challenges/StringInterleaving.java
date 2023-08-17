package session6.challenges;
import java.util.Scanner;
public class StringInterleaving {
    public static void main(String[] args) {

//  17. String Interleaver
//  Description: Write a program using StringBuilder that interleaves two strings.
//  For instance, given "abc" and "123", the result should be "a1b2c3".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to interleave");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ;i<string1.length() && i<string2.length();i++){
            stringBuilder.append(string1.charAt(i));
            stringBuilder.append(string2.charAt(i));
        }

        System.out.println(stringBuilder);


    }
}
