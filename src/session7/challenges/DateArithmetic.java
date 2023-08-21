package session7.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

//  7. Date Arithmetic
//  Description: Write a method named addWeeksToToday that accepts an integer as its argument.
//  This integer denotes the number of weeks.
//  The method should add this number of weeks to today's date and return the resultant date.
//  Input: An integer n (e.g., 4).
//  Expected Output: A date object that is n weeks from today.
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        System.out.println("enter a number to increment the weeks");
        long increment = scanner.nextLong();
        System.out.println(addWeeksToToday(localDate, increment));
        scanner.close();
    }

    public static LocalDate addWeeksToToday(LocalDate localDateTime, long incrementWeeks) {
        return localDateTime.plusWeeks(incrementWeeks);
    }


}
