package session4_javaOperatorsAndLoops.challenges;

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {

//  7. Write a Java program that determines the type of a triangle based on its sides.
//  Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
//  Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers for the triangle' sides.");

        int sideOne = sc.nextInt();
        int sideTwo = sc.nextInt();
        int sideThree = sc.nextInt();


        System.out.println((sideOne == sideTwo && sideOne == sideThree && sideTwo == sideThree) ? "EquiLateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles" : "Scalene");

        //Holy shit. I understand how this works.
        //Explanation : IF all the sides are equal '(sideOne == sideTwo && sideOne == sideThree && sideTwo == sideThree) ? "EquiLateral" '
        //the result will be that our triangle is Equilateral(which means our program will stop there). ELSE-IF two sides are equal our triangle will be "Isosceles"
        //ELSE our triangle  will be "Scalene".

//  8. Write a Java program to calculate the factorial of a number using a for loop.
//  Declare an integer variable number and assign a value to it.
//  Then calculate and print the factorial of number.

        System.out.println();
        System.out.println("Enter a number for a factorial operation.");
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            System.out.print(fact + " ");
        }
        System.out.println();
        System.out.println();
//  9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
//  Check if countryOne and countryTwo are equal using the equals() method and print the result.
//  Then change the value of countryTwo to "UK" and check for equality again. Print the result.

        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println("Result is : " + countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println("Result is : " + countryOne.equals(countryTwo));
        System.out.println();
//  10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
//  Add some elements to listOne and assign listOne to listTwo.
//  Now modify listOne by adding a new element. Print both lists and observe the output.

        ArrayList<Integer> listOne = new ArrayList<Integer>();
        listOne.add(10);
        listOne.add(11);
        listOne.add(12);
        ArrayList<ArrayList<Integer>> listTwo = new ArrayList<ArrayList<Integer>>();
        listTwo.add(listOne);
        System.out.println(listOne);
        System.out.println(listTwo);

        listOne.add(345);
        System.out.println(listOne);
        System.out.println(listTwo);

        sc.close();
    }
}
