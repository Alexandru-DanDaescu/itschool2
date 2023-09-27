package codingkata.session3;
import java.util.*;
public class Floors {

    public static void main(String[] args) {


        //Problem statement : https://www.codechef.com/problems/FLOORS

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int xFloor = (x - 1)/10;
            int yFloor = (y - 1)/10;

            System.out.println(Math.abs(yFloor - xFloor));
        }

    }
}
