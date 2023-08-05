package session3.challenges;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        /*
        1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
        3. Write a program to check if a number is positive or negative using logical complement operator.
        4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        5. Create a Java program that demonstrates the use of each compound assignment operator with integers.
        6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        7. Write a program where you perform operations between an integer and a double. Display the result.
        8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
        9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        10. Write a program that reverses the sign of an entered integer using unary minus operator.
        11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        */

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter one of these commands to make a mathematical operation :"+
                "\n(+,-,*,/,%,byte,unary,rectangle,bool)"  +
                "\n(or type 'for' to use for loop to count from 1 to 10 or from 10 to 1 or '00' for double operations)");
        String userInput = sc.nextLine();
        userInput = userInput.toLowerCase();

        if (userInput.equals("+"))
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1 + num2);
            System.out.println("If you want to increment the results type (++)");
            userInput = sc.next();
            if (userInput.equals("++"))
            {
                System.out.println("Addition without incrementation: " + (num1 + num2));
                System.out.println("Addition with incrementation: " + ((++num1) + (++num2)));
                int compoundAssignment = 142;
                compoundAssignment += num2;
                System.out.println(compoundAssignment + " Compound assignment has been used for this operation.");

            } else System.exit(0);

        }
        else if (userInput.equals("-"))
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1 - num2);
            System.out.println("If you want to decrement the results type (--)");
            userInput = sc.next();
            if (userInput.equals("--"))
            {
                System.out.println("Subtraction without decrementation: " + (num1 - num2));
                System.out.println("Subtraction with decrementation: " + ((--num1) - (--num2)));
                int compoundAssignment = 14;
                compoundAssignment -= num2;
                System.out.println(compoundAssignment + " Compound assignment was used for this operation.");
            } else System.exit(0);

        }
        else if (userInput.equals("*"))
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int result = num1 * num2;
            boolean falsePositive = (result <= 0);
            if (!falsePositive) System.out.println("The number positive");
            else System.out.println("The number is negative");
            int compoundAssignment = 4;
            compoundAssignment *= result;
            System.out.println(compoundAssignment + " Compound assignment was used for this operation.");
        }
        else if (userInput.equals("/"))
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
            int compoundAssignment = 23;
            compoundAssignment /= result;
            System.out.println(compoundAssignment + " Compound assignment was used for this operation.");
            if (num1 == num2) System.out.println("num1 is equal to num2.");
        }
        else if (userInput.equals("%"))
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println(num1 % num2);
            int result = num1 % num2;
            int compoundAssignment = 123;
            compoundAssignment %= result;
            System.out.println(compoundAssignment + " Compound assignment was used for this operation.");
            if (num1 <= num2) System.out.println(num1+" is smaller than num2");
            else System.out.println(num2+" is greater than num1");
        }
        else if (userInput.equals("for"))
        {
            System.out.println("Do you want to increment or decrement? (type ++ or --)");
            userInput = sc.nextLine();
            if (userInput.equals("++"))
            {
                num1 = sc.nextInt();
                for (int i = 0; i < num1; i++)
                    System.out.println(i);
            }
            else if (userInput.equals("--"))
            {
                num2 = sc.nextInt();
                for (int i = num2; i > 0; i--)
                    System.out.println(i);
            }
            else System.exit(0);
        }
        else if (userInput.equals("00"))
        {
            System.out.println("Enter an integer first then a double");
            num1 = sc.nextInt();
            double num3 = sc.nextDouble();
            System.out.println(num1 + num3);
            System.out.println(num1 - num3);
            System.out.println(num1 / num3);
            System.out.println(num1 * num3);
            System.out.println(num1 % num3);
        }
        else if (userInput.equals("byte"))
        {
            System.out.println
                    ("This is a byte operation.(keep in mind that the limits of a byte value are between -128 to 127)"
                    +"\n(to use a byte in mathematical operations you need to cast them to byte)");
            byte num4 = sc.nextByte();
            byte num5 = sc.nextByte();
            byte result = (byte) (num4 + num5);
            System.out.println(result);
        }
        else if (userInput.equals("unary"))
        {
            num1 = sc.nextInt();
            System.out.println(-(num1));

        }
        else if (userInput.equals("rectangle"))
        {
            System.out.println("Enter the length and width of the rectangle");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("The width is: "+ num1 * num2);
            if(num1 < num2) System.out.println("num1 is smaller than num2");
            else if(num1 > num2) System.out.println("num2 is greater than num1");
            else System.exit(0);
        }
        else if (userInput.equals("bool"))
        {
            boolean bool1 = sc.hasNext();
            boolean bool2 = sc.hasNext();
            bool1 = !bool1;
            bool2 = !bool2;
            System.out.println(bool1+"\n"+bool2);
        }
        else System.exit(0);

    }
}
