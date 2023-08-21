package session7.challenges;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class WeekdayIdentifier {
    public static void main(String[] args) {

//  8. Weekday Identifier
//  Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
//  Input: A date in the format YYYY-MM-DD.
//  Expected Output: The day of the week in string format (e.g., "Wednesday")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date to find what day it is today.");
        String date = scanner.nextLine();
        System.out.println(findDayOfWeek(date));
        scanner.close();

    }
    public static String findDayOfWeek(String day){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(day,dateTimeFormatter);
        return localDate.getDayOfWeek().toString();
   }
}
