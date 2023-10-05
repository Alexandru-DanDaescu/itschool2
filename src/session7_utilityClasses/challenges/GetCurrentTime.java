package session7_utilityClasses.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentTime {
    public static void main(String[] args) {
//  6. Getting Current Time
//  Description: Write a method named displayCurrentTime that prints the current time to the console.
//  Expected Output: The current time in the format HH:MM:SS.

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(displayCurrentTime(localDateTime));
    }

    public static String displayCurrentTime(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return localDateTime.format(dateTimeFormatter);
    }


}
