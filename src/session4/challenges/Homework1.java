package session4.challenges;

import java.util.*;

public class Homework1 {

    public static void main(String[] args) {


//  1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
//  Check and print whether they refer to the same object.

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        boolean checkValue1 = (stringOne == stringTwo);
        boolean checkValue2 = (stringOne.equals(stringTwo));
        System.out.println("The results for " + "checkValue1 is : " + checkValue1 + " \nand checkValue2 : " + checkValue2);
        System.out.println();

//  2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
//  Use an equality operator to compare these two numbers and print the result.
//  Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison.
//  Print the result.

        int firstNumber = 12;
        int secondNumber = 16;

        System.out.println("The result for the integer variables is : " + (firstNumber == secondNumber ? true : false));
        System.out.println();
        String firstString = "124";
        String secondString = "456";

        System.out.println("The result for the string variables is : " + (firstString.equals(secondString) ? true : false));
        System.out.println();
//  3. Write a Java program that declares an integer variable age with a value of 20.
//  Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".

        int age = 20;
        if (age >= 18) System.out.println("I am an adult");
        else System.out.println("I am not an adult");
        System.out.println();

//  4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
//  Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two heights (the variables can have any value)");
        int heightOne = sc.nextInt();
        int heightTwo = sc.nextInt();

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println("The result is " + maximumHeight + " The heights are : " + heightOne + " and " + heightTwo);
        System.out.println();
//  5. Write a Java program to print the numbers from 1 to 10 using a for loop.
//  As a next step, modify your program to print only the even numbers from 1 to 10.

        //simple for loop
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println();
        System.out.println();

        //for loop with even numbers
        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0) System.out.print(i + " ");

        System.out.println();
        System.out.println();

//  6. Write a Java program where you declare an integer variable temperature.
//  Assign a value to it and print "Hot" if the temperature is more than 30,
//  "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        System.out.println("Enter a temperature");

        int temperature = sc.nextInt();
        if (temperature < 20) System.out.println("Cold");
        else if (temperature >= 20 && temperature <= 30) System.out.println("Warm");
        else System.out.println("Hot");

        sc.close();

    }


}
