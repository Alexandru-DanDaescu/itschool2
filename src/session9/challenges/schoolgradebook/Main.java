package session9.challenges.schoolgradebook;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

//  2. School Grade book  - Develop a grade book system for a school where teachers can:
//  Add students to their classes.
//  Each student has a name and a unique student ID.
//  Assign grades for assignments or exams to each student.
//  Calculate the average grade for each student in their class.
//  View a list of all students and their respective average grades.



        Students student = new Students();

        SchoolClass schoolClass = new SchoolClass();

        schoolClass.printStudentsInformation(student);


    }
}
