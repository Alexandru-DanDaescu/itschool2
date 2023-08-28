package session9.challenges.schoolgradebook;
import java.util.Scanner;
public class SchoolClass {




    public void printStudentsInformation(Students students){
        System.out.println("The student "+students.getStudentName()+" with id code "+students.getUuid()+" has a grade score of "+
              SchoolClass.averageGradeSum());

    }

    private static int averageGradeSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of grades for the student");
        int numberOfGrades = scanner.nextInt();
        int[] gradesScore = new int[numberOfGrades];
        int sum = 0;
        for(int i = 0;i<gradesScore.length;i++){
            gradesScore[i] = scanner.nextInt();
            sum += gradesScore[i];

        }
        return sum / gradesScore.length;

    }



}
