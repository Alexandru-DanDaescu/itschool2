package session_31javaCoreRecap;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int numberOfRows = scanner.nextInt();
            for (int rowIndex = 1; rowIndex <= numberOfRows; rowIndex++) {
                for (int columnIndex = 1; columnIndex <= rowIndex ; columnIndex++) {
                    System.out.print(columnIndex);
                }
                System.out.println();
            }
        }

    }
}
