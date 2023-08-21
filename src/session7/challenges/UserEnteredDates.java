package session7.challenges;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class UserEnteredDates {
    public static void main(String[] args) {
//  4. Comparing User-Entered Dates
//  Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal,
//  and false otherwise.
//  Input: Two dates entered by the user in the format YYYY-MM-DD.
//  Expected Output:
//  true if both dates are equal.
//  false if they are different.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two dates to compare");
        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();
        System.out.println(areDatesEqual(date1, date2));
        scanner.close();

    }

    public static boolean areDatesEqual(String dateOne, String dateTwo) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateOne = LocalDate.parse(dateOne, dateTimeFormatter);
        LocalDate localDateTwo = LocalDate.parse(dateTwo, dateTimeFormatter);
        //You can also use LocalDateTime to parse strings but it needs to be written like this :
        //LocalDateTime localDateTime = LocalDate.parse(dateStr,dateTimeFormatter).atStartOfDay();
        //Why? Because formatted String doesn't contain time information.
        return localDateOne.equals(localDateTwo);
    }

}
