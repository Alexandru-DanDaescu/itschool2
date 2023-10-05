package session7_utilityClasses.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDecomposition {

    public static void main(String[] args) {
//  2. Date Decomposition
//  Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month,
//  and day components separately.
//  Input: A date in the format YYYY-MM-DD.
//  Expected Output:
//  makefile   (?)
//  Copy code  (?)
//  Year: YYYY
//  Month: MM
//  Day: DD

        LocalDateTime localDateTime = LocalDateTime.now();
        displayDateComponents(localDateTime);

    }

    public static void displayDateComponents(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Year : " + formatDateTime.substring(0, 4) + "\nMonth : " + formatDateTime.substring(5, 7) +
                "\nDay : " + formatDateTime.substring(8, 10));

    }
}
