package session7_utilityClasses.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAuthenticator {
    public static void main(String[] args) {
//  10. Date Authenticator
//  Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD).
//  The method should also consider leap years when validating February dates.
//  Input: A string of a date from the console.
//  Expected Output:
//  true if the input adheres to the date format and denotes a genuine date.
//  false if otherwise.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date of type (YYYY-MM-DD) to check whether the date has leap years and has valid format or not");
        String dateInput = scanner.nextLine();
        System.out.println(isValidDate(dateInput) ? "Valid date" : "Not a valid date"); // Its "technically" correct
        // except for the part where a wrong date format is introduced. (for that, a try catch needs to be added into the equation)
        scanner.close();


    }

    public static boolean isValidDate(String dateInput) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateInput, dateTimeFormatter);
        String formatChecker = localDate.format(dateTimeFormatter);

        return !dateIsLeapYear(localDate) && formatChecker.equals(dateInput);
    }

    public static boolean dateIsLeapYear(LocalDate localDate) {
        return localDate.isLeapYear();
    }


}
