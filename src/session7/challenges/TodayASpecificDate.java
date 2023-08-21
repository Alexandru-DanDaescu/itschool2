package session7.challenges;

import java.time.LocalDate;

public class TodayASpecificDate {


    public static void main(String[] args) {
//  5. Is Today a Specific Date?
//  Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
//  Expected Output:
//  true if today's date is 2019-12-10.
//  false otherwise.
        LocalDate localDate = LocalDate.now();
        System.out.println(isTodaySpecificDate(localDate));

    }

    public static boolean isTodaySpecificDate(LocalDate localDate) {
        return LocalDate.of(2019, 12, 10).equals(localDate);
    }
}
