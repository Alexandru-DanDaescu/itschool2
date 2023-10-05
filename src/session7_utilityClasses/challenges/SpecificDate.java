package session7_utilityClasses.challenges;

import java.time.LocalDate;

public class SpecificDate {
    public static void main(String[] args) {
//  3. Create a Specific Date
//  Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//  Expected Output: A date object for 2025-8-19.

        System.out.println(createSpecificDate());


    }

    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }
}
