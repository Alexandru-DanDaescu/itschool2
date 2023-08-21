package session7.challenges;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.ZonedDateTime;

public class TimeZoneConversion {
    public static void main(String[] args) {
//  12. Time Conversion Across Zones
//  Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST").
//  The objective is to transmute the specified date and time to align with the provided timezone and then showcase the result.
//  Input:
//  Date and time structured as YYYY-MM-DD HH:MM:SS.
//  A string indicating the timezone (e.g., "EST").
//  Expected Output: The recalibrated date and time synchronized with the inputted timezone.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a timezone to convert from EST to PST");
        String input = scanner.nextLine();
        System.out.println(convertToTimeZone(input));
        scanner.close();

    }

    public static String convertToTimeZone(String dateInput) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ZoneId entryZoneId = ZoneId.of("America/New_York");
        ZoneId destinationZoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime newYorkZonedDateTime = localDateTime.atZone(entryZoneId);
        ZonedDateTime losAngelesZonedDateTime = newYorkZonedDateTime.withZoneSameInstant(destinationZoneId);

        return losAngelesZonedDateTime.toString();
    }

}
