package session7_utilityClasses.practice;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println();
        printLocalDateTimeDecrement(localDateTime, 5);

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now().plusDays(1);

        printLocalDateTimeDifference(start,end);

        printFormattedLocalDateTime(localDateTime);

    }


    public static void printLocalDateTimeDecrement(LocalDateTime localDateTime, long decrementHours) {
        System.out.println(localDateTime.minusHours(decrementHours));
    }

    public static void printLocalDateTimeDifference(LocalDateTime localDateTimeStart, LocalDateTime localDateTimeEnd) {
        Duration duration = Duration.between(localDateTimeStart, localDateTimeEnd);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        System.out.printf("Time difference is %d hours, %d minutes, %d seconds.", hours, minutes, seconds);
    }

    public static void printFormattedLocalDateTime(LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("\n"+formatDateTime);
    }

}
