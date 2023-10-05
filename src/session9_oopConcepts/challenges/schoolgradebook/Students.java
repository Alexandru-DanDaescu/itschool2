package session9_oopConcepts.challenges.schoolgradebook;



import java.util.Scanner;
import java.util.UUID;

public class Students {

    private String studentName;

    private UUID uuid;

    public Students(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        this.studentName = scanner.nextLine();
        this.uuid = UUID.randomUUID();
    }

    public String getStudentName(){
        return studentName;
    }

    public UUID getUuid() {
        return uuid;
    }



}
