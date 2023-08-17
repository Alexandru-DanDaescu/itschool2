package codingkata.session2;
import java.util.List;
import java.util.ArrayList;

public class IntegerToDigitArray {
    public static void main(String[] args) {
        int number = 12345;
        int[] digits = digitToArray(number);
        for(int digit : digits){
            System.out.println(digit+" ");
        }

    }

    public static int[] digitToArray(int number){

        int numberLength = Integer.toString(number).length();
        int[] digits = new int[numberLength];
        for(int i = numberLength - 1;i>= 0;i--){
            digits[i] = number%10;
            number /= 10;
        }

        return digits;

    }

}
