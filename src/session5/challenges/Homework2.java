package session5.challenges;

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {
//  6. While Loop
//  Write a program that asks the user to enter numbers.
//  The program should continue prompting the user until they enter -1.
//  After they enter -1, print the sum of all numbers entered (excluding -1).

        System.out.println("Enter numbers until to calculate. To exit enter type -1");
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = sc.nextInt();
            sum += number;
            if (number == -1) break;
        }
        System.out.println(sum);

//  7. Do-While Loop
//  Create a program where the user is prompted to guess a predefined number.
//  After each guess, the program should inform the user if the guess is too high or too low.
//  The program should keep prompting the user until they guess correctly.
//  Using a do-while loop, ensure the user is always asked at least once.


        Random random = new Random();
        int number = random.nextInt(30) + 1;
        int guess = 0;
        do {
            System.out.println("Enter a number to guess.");
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess == number) {
                System.out.println("You won!");
            } else System.out.println("Too high.");
        }
        while (guess != number);


//  8. For Loop
//  Write a program that prints the first 10 numbers in the Fibonacci series.
//  Use a for loop to accomplish this.

        System.out.println("Enter a number to create a fibonacci sequence");
        int fibonacci = sc.nextInt();
        int first = 0, second = 0, third = 1;
        for (int i = 1; i <= fibonacci; i++) {
            first = second;
            second = third;
            third = first + second;
            System.out.println(first);

        }

//  9. For-Each Loop
//  Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd.
//  Utilize a for-each loop for this task.

        System.out.println();
        System.out.println("Program that checks if numbers are even or odd.");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else System.out.println(i + " is not even.");
        }

//  10. Jump Statements
//  Create a menu-driven program where the user is presented with options:
//  Print "Hello World"
//  Print the user's name.
//  Exit.
//  Based on the user's input, perform the necessary action.
//  Once an action is completed, show the menu again, unless the user chooses the Exit option.
//  Use jump statements to control the flow of the program.


        //boolean displayMenu = true; can also initialize a boolean, then in the switch, I can turn the boolean to false,
        //which results in the program closing.
        while (true) {

            System.out.println("Enter one of these commands : (print,name,exit,test)");
            String input = sc.next();
            input = input.toLowerCase();

            if (input.equals("test")) {
                System.out.println("testing how the continue statement works");
                continue;
            }

            switch (input) {
                case "name":
                    System.out.println("Enter your name.");
                    String name = sc.next();
                    System.out.println(name);
                    break;
                case "print":
                    System.out.println("Hello World!");
                    break;
                case "exit":
                    System.out.println("You logged out of the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid option.");
            }


        }


    }
}
