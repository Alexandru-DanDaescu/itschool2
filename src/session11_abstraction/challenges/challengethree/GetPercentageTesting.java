package session11_abstraction.challenges.challengethree;

public class GetPercentageTesting {

    public static void main(String[] args) {

        StudentA studentA = new StudentA();

        studentA.getPercentage();

        studentA.printStudentAndGrades();

        StudentB studentB = new StudentB();

        studentB.getPercentage();

        studentB.printStudentAndGrades();


    }
}
