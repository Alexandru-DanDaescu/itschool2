package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Alice");               //ctrl + d to duplicate
        names.add("Bob");
        names.add("Charlie");
        names.add("Eva");
        names.add(2, "Frank");

        System.out.println(names);
    }
}
