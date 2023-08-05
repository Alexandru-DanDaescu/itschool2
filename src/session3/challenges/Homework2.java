package session3.challenges;

import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args)
    {
        /*
        12. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        13. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        14. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to increment and decrement by 1");
        int num1 = sc.nextInt();
        num1 += 1;
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        System.out.println("Enter a price and a discount for an object.");
        int price = sc.nextInt();
        int discount = sc.nextInt();
        System.out.println("The original price of the object is: "+price+
                "\nThe price of the object after discount is: "+(price - discount));
        System.out.println("Enter a number between 324-401");
        int num3 = (sc.nextInt()+500)/2;
        if(num3 >= 324 && num3 <= 401) System.out.println("User is in the specified range");
        else System.out.println("User is not in specified range");
        sc.close();
    }
}
