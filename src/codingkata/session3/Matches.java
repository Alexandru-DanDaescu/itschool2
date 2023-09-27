package codingkata.session3;
import java.util.*;
public class Matches {

    public static void main(String[] args) {

        //Problem statement : https://www.codechef.com/COOK110B/problems/MATCHES

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Map<Integer,Integer> value = new HashMap<>();
        value.put(0,6);
        value.put(1,2);
        value.put(2,5);
        value.put(3,5);
        value.put(4,4);
        value.put(5,5);
        value.put(6,6);
        value.put(7,3);
        value.put(8,7);
        value.put(9,6);


        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;
            int count = 0;
            while(sum > 0){
                count += value.get(sum%10);
                sum = sum/10;
            }

            System.out.println(count);

        }

    }
}
