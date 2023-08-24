package session8.challenges;

import java.util.List;
import java.util.LinkedList;

public class RemoveExistingStudent {

    public static void main(String[] args) {


//  6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
//  If it does, remove that name from the list.


        List<String> studentList = new LinkedList<>();
        studentList.add("Moriarty");
        studentList.add("Francis");
        studentList.add("Alex");

        if (studentList.contains("Francis") && studentList.contains("Alex")) {
            studentList.remove(1);
            studentList.remove(1); //if you add 2 instead of 1 you will get an out-of-bounds exception because,
                                         //the remove method also shifts the elements
        }

        System.out.println(studentList);

    }
}
