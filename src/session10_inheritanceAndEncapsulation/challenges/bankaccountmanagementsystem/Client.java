package session10_inheritanceAndEncapsulation.challenges.bankaccountmanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Client {

    private double currentBalance;
    private char sex;
    private String dateOfBirth;


    public Client(double currentBalance, char sex, String dateOfBirth) {
        this.currentBalance = currentBalance;
        this.sex = sex;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString();
    }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public char getSex() {
        return sex;
    }

    public String getDate() {
        return dateOfBirth;
    }


    public String toString() {
        return "Client{" +
                "sex=" + sex +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
