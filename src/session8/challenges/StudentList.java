package session8.challenges;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

//  3. Create
//  2 empty ArrayLists: studentList and graduateStudentList
//  populate studentList with 10 students
//  copy values from studentList to graduateStudentList
//  iterate through graduateStudentList and print each graduated student


        List<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Zack");
        studentList.add("Elizabeth");
        studentList.add("Zack");
        studentList.add("Connor");
        studentList.add("James");
        studentList.add("Joshua");
        studentList.add("William");
        studentList.add("Mark");
        studentList.add("Andrew");

        List<String> graduateStudentList = new ArrayList<>();
        graduateStudentList.add(studentList.toString());
        for (String i : graduateStudentList) {
            System.out.println(i);
        }


        //Another way to do this.
        /*
        List<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Zack");
        studentList.add("Elizabeth");
        studentList.add("Zack");
        studentList.add("Connor");
        studentList.add("James");
        studentList.add("Joshua");
        studentList.add("William");
        studentList.add("Mark");
        studentList.add("Andrew");
        List<String> graduateStudentList = studentList;
        System.out.println(graduateStudentList);
         */
    }
}










