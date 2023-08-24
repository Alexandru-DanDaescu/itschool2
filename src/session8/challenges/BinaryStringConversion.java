package session8.challenges;

public class BinaryStringConversion {

    public static void main(String[] args) {
//  9.Accept a string representation of a binary number, e.g., "1011".
//  Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
//  Print out the decimal representation of this number.

        String binaryString = "1110100101";
        int decimalTranslation = Integer.parseInt(binaryString, 2);
        System.out.println(decimalTranslation);


    }
}
