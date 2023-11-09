package session_31javaCoreRecap;

public class ReportGenerator {

    public static void main(String[] args) {
        double revenue = 123456.789;
        String date = "2023-04-15";

        System.out.println(String.format("On %s, the total revenue was $%.2f",date,revenue));
        System.out.println("On %s, the total revenue was $%.2f".formatted(date,revenue));
    }
}
