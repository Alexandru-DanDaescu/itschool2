package session11_abstraction.challenges.challengethree;

import java.util.Scanner;

public class StudentB extends Marks{

    private Scanner scanner;

    private String studentName;
    private double[] grades;
    private int amountOfGrades;
    private double sum;
    public StudentB() {
        System.out.println("Enter the student's name");
        scanner = new Scanner(System.in);
        this.studentName = scanner.next();
    }


    @Override
    protected double getPercentage() {
        addGrades();
        sum = 0;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextDouble();
            if(grades[i] >= 0 && grades[i] <= 100){
                sum += grades[i] / amountOfGrades;
            }
            else{
                System.out.println("ERROR: Expected input is higher than specified limit");
                break;
            }

        }
        return sum;
    }

    @Override
    protected void addGrades() {
        System.out.println("Enter the amount of grades for the student");
        amountOfGrades = scanner.nextInt();
        grades = new double[amountOfGrades];
    }


    @Override
    protected void printStudentAndGrades() {
        System.out.printf("Student %s has a grade score of : %.2f" ,studentName,sum);
        System.out.println();
    }




}
