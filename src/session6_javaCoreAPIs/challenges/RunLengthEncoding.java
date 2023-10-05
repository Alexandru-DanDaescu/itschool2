package session6_javaCoreAPIs.challenges;
import java.util.Scanner;
public class RunLengthEncoding {

    public static void main(String[] args) {

//  19. Encode Strings with Run-Length Encoding (RLE)
//  Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm.
//  For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();


        for(int i = 0;i<string.length();i++){
            int count = 0;

            while (i < string.length()-1 && string.charAt(i) == string.charAt(i+1)){
                stringBuilder.append(string.charAt(i));
                count++;
                i++;
            }
            System.out.print(stringBuilder+""+count); // The result is not shown correctly.
        }



    }
}
