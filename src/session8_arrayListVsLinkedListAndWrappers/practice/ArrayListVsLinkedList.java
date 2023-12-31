package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new ArrayList<>();

//        for (int index = 0 ; index < 100000; index++){
//            arrayList.add(String.valueOf(index));
//            linkedList.add(String.valueOf(index));
//        }

        //check if linkedList is faster for add method
        long startTimerArrayList = System.currentTimeMillis();
        for(int index = 0; index < 1000000;index++){
            arrayList.add(0,String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();


        long startTimerLinkedList = System.currentTimeMillis();
        for(int index = 0; index < 1000000;index++){
            linkedList.add(0,String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList time: "+ (endTimerArrayList - startTimerArrayList));
        System.out.println("LinkedList time: "+ (endTimerLinkedList - startTimerLinkedList));

    }
}
