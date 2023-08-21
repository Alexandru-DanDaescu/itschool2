package session7.challenges;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationSince {
    public static void main(String[] args) {
//  11. Duration Since
//  Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
//  Input: A time given in the format HH:MM:SS.
//  Expected Output: The time span given as X hours, Y minutes, Z seconds.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours,minutes and seconds to calculate the total elapsed time between current time and your input.");
        String time = scanner.nextLine();
        elapsedTimeSince(time);


    }

    public static void elapsedTimeSince(String string) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //Apparently, using LocalDate and LocalDateTime does not work for this specific exercise.
        LocalTime localTimeOne = LocalTime.parse(string, dateTimeFormatter);
        LocalTime localTimeTwo = LocalTime.now();

        Duration duration = Duration.between(localTimeOne, localTimeTwo);
        //These calculations are written to show the elapsed time correctly.
        //The way I wrote the code originally was without these calculations.
        //Instead of showing the TOTAL elapsed time, it was showing the elapsed time of the input in HOURS,MINUTES,SECONDS.
        long hours = duration.toHours();
        long minutes = duration.toMinutes() - (hours * 60);
        long seconds = duration.toSeconds() - (hours * 3600) - (minutes * 60);

        System.out.printf("The time span given as %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }

}
