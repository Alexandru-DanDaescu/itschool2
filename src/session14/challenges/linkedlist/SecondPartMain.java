package session14.challenges.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class SecondPartMain {

    public static void main(String[] args) {

        //12.

        LinkedList<Integer> listOfNumbers = new LinkedList<>();

        listOfNumbers.add(12);
        listOfNumbers.add(112);
        listOfNumbers.add(1342);
        listOfNumbers.add(5612);
        listOfNumbers.add(5872);

        System.out.println(removeElement(listOfNumbers,112));

        //13.

        LinkedList<Integer> removeFirstAndLastElement = new LinkedList<>();
        removeFirstAndLastElement.add(12432);
        removeFirstAndLastElement.add(1);
        removeFirstAndLastElement.add(2);
        removeFirstAndLastElement.add(3);
        removeFirstAndLastElement.add(45432);
        removeFirstAndLast(removeFirstAndLastElement);

        //14.

        System.out.println(removeAll(removeFirstAndLastElement));

        //15.

        LinkedList<Double> doubleLinkedList = new LinkedList<>();
        doubleLinkedList.add(103.14);
        doubleLinkedList.add(433.38);
        doubleLinkedList.add(563.54); //2 gets swapped with 5
        doubleLinkedList.add(4563.74);
        doubleLinkedList.add(2786.45);
        doubleLinkedList.add(245.14); //5

        System.out.println(swapElements(doubleLinkedList));

        //16.

        LinkedList<String> axes = new LinkedList<>();
        axes.add("Fire axe");
        axes.add("Ice axe");
        axes.add("Void axe");
        axes.add("Reinforced axe");
        axes.add("Rusty axe");

        System.out.println(shuffleElements(axes));

        //17.

        System.out.println(joinLinkedLists());

        //18.

        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');

        System.out.println(cloneList(list));

        //19.

        System.out.println(removeAndReturnElement(list));

        //20.

        peekFirstElement(list);

    }

    //12.

    private static LinkedList<Integer> removeElement(LinkedList<Integer> linkedList, int target){
        for(int i = 0;i<linkedList.size();i++){
            if(linkedList.get(i) == target){
                target = linkedList.remove(i);
            }
        }
        return linkedList;
    }

    //13.

    private static void removeFirstAndLast(LinkedList<Integer> list){
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

    //14.

    private static LinkedList<Integer> removeAll(LinkedList<Integer> list){
        list.removeAll(list);
        return list;
    }

    //15.
    private static LinkedList<Double> swapElements(LinkedList<Double> list){
        Collections.swap(list,2,5);
        return list;
    }

    //16.

    private static LinkedList<String> shuffleElements(LinkedList<String> list){
        Collections.shuffle(list);
        return list;
    }

    //17.

    private static LinkedList<Integer> joinLinkedLists(){
        LinkedList<Integer> firstList = new LinkedList<>();
        firstList.add(12);
        firstList.add(12);
        firstList.add(12);
        firstList.add(12);
        firstList.add(12);

        LinkedList<Integer> secondList = new LinkedList<>();
        secondList.add(12);
        secondList.add(12);
        secondList.add(12);
        secondList.add(12);
        secondList.add(12);

        LinkedList<Integer> mergeLinkedLists = new LinkedList<>();
        mergeLinkedLists.addAll(firstList);
        mergeLinkedLists.addAll(secondList);

        return mergeLinkedLists;

    }

    //18.

    private static LinkedList<Character> cloneList(LinkedList<Character> list){
        return (LinkedList<Character>) list.clone();
    }

    //19.

    private static LinkedList<Character> removeAndReturnElement(LinkedList<Character> list){
        list.pop();
        return list;
    }

    private static void peekFirstElement(LinkedList<Character> list){
        System.out.println(list.peekFirst());
    }

}
