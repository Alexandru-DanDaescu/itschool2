package session5.challenges;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  11. Break Statement
//  Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
//  If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.

        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter two or more numbers to make an average operation. Enter 0 to quit.");
            int number = sc.nextInt();
            sum += number;
            if (number != 0) count++;
            if (number == 0) {
                System.out.println(sum / count);
                break;
            }
        }

//  12. Continue Statement
//  Create a program that asks the user for 10 numbers.
//  Print the sum of all numbers that are greater than 5.
//  If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.

        System.out.println("Enter 10 numbers for addition");
        int addition = 0;
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            if (number <= 5) continue;
            addition += number;

        }
        System.out.println(addition);
        sc.close();

    }
}
