package session5_advancedFlowControl.challenges;

import java.util.*;

public class Homework1 {

    public static void main(String[] args) {

//  1. Even or Odd Checker
//  Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's odd or even.");

        int number = sc.nextInt();

        System.out.println(number % 2 == 0 ? "Even" : "Odd");
//  2. Month Name Finder
//  Write a program that asks the user to enter a number between 1 and 12.
//  Print the name of the corresponding month or "Invalid Month" if out of range.

        System.out.println("Enter a number between (1-12) to whether the month is valid or invalid.");

        int monthNumber = sc.nextInt();

        monthFinder(monthNumber);

//  3. Counting Negative Numbers
//  Given an array of integers, write a program to count and print the number of negative integers in the array.

        System.out.println("Enter the length of the length of the array and enter negative or positive numbers");

        int arrayLength = 0;
        int[] array = new int[0];
        printNegativeNumbersArray(sc, arrayLength, array);

//  4. String Reverser
//  Ask the user to enter a string. Print the reversed version of this string.

        System.out.println("Enter a string to revert.");

        String input = sc.next();
        System.out.println(reverseString(input));  //Next time,check if the result is printed
        // before assuming you did something wrong.

//  5. Fibonacci Series Generator
//  Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

        System.out.println("Enter a number to create a fibonnaci series");
        int fibonnaci = sc.nextInt();
        int index = 1, firstNumber = 0, secondNumber = 0, thirdNumber = 1;
        while (index <= fibonnaci) {
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
            System.out.print(firstNumber + " ");
            index++;
        }

        sc.close();


    }

    //2.
    public static int monthFinder(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
        return monthNumber;
    }

    //3.
    public static void printNegativeNumbersArray(Scanner sc, int arrayLength, int[] array) {
        arrayLength = sc.nextInt();
        array = new int[arrayLength];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                count++;
            }

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The amount of negative numbers in the array are : " + count);
    }

    //4.
    public static String reverseString(String normalString) {
        String rev = "";
        for (int i = normalString.length(); i > 0; i--) {
            rev += normalString.charAt(i - 1);
        }
        return rev;
    }


}


