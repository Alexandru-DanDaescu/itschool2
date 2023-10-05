package session7_utilityClasses.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateMethod {

    public static void main(String[] args) {

//  1. Displaying Today's Date
//  Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
//  Expected Output: Today's date in the format YYYY-MM-DD.

        LocalDateTime localDateTime = LocalDateTime.now();
        displayTodaysDate(localDateTime);
    }

    public static void displayTodaysDate(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(formatDateTime + "\n");
    }

}
