package codingkata.session3;
import java.util.*;
import java.util.stream.IntStream;

public class PrettyNumbers {

    public static void main(String[] args) {

        //Problem statement: https://www.codechef.com/problems/NUM239?tab=statement

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int start = sc.nextInt();

            int stop = sc.nextInt();

            long counter =  IntStream.range(start,stop).filter(lastDigit -> lastDigit%10 == 2 || lastDigit%10 == 3 || lastDigit%10 == 9)
                    .count();

            System.out.println(counter);

        }


    }
}
