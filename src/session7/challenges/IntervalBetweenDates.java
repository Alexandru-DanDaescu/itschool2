package session7.challenges;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class IntervalBetweenDates {
    public static void main(String[] args) {
//  9. Interval Between Dates
//  Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
//  Input: Two dates given by the user in the format YYYY-MM-DD.
//  Expected Output: An integer showcasing the difference in days between the two dates.

        Scanner dateInput = new Scanner(System.in);
        System.out.println("Enter two dates to compare the days between them.");
        String firstDate = dateInput.next();
        String secondDate = dateInput.next();

        System.out.println(daysBetween(firstDate, secondDate));

        dateInput.close();

    }

    public static long daysBetween(String dateOne, String dateTwo) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateOne = LocalDate.parse(dateOne, dateTimeFormatter);
        LocalDate localDateTwo = LocalDate.parse(dateTwo, dateTimeFormatter);
        //Duration duration = Duration.between(localDateOne,localDateTwo);


        return ChronoUnit.DAYS.between(localDateOne, localDateTwo); //returns the difference between the two dates in days,
        // including in the equation the years and months by transforming the years and months into days
    }


}

//  A Duration is most suitable in situations that measure machine-based time, such as code that uses an Instant object.
//  Duration object is measured in seconds or nanoseconds and does not use date-based constructs such as years, months, and days,
//  though the class provides methods that convert to days, hours, and minutes.
//  A Duration can have a negative value, if it is created with an end point that occurs before the start point.

//  To define an amount of time with date-based values (years, months, days), use the Period class.
//  The Period class provides various get methods, such as getMonths, getDays, and getYears, so that you can extract the amount of time from the period.
//  The period class does not include the transformation of months and years into days from what I have searched.