package session14_javaCollectionsFramework.challenges.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        //1.
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(appendElements(list));

        //2.

        iterateThroughLinkedList(list);

        //3.
        System.out.println();
        iterateFromASpecificPosition(list);

        //4.
        System.out.println();
        iterateReverseOrder(list);

        //5.
        System.out.println();
        System.out.println(insertElementAtPosition(list));

        //6.
        System.out.println(insertAtBeginningAndEnd());

        //7.

        System.out.println(insertAtFront());

        //8.
        System.out.println(insertAtEnd());

        //9.

        System.out.println(insertAtSpecifiedPosition());

        //10.

        LinkedList<Boolean> linkedList = new LinkedList<>();
        linkedList.add(true);
        linkedList.add(false);
        linkedList.add(false);
        linkedList.add(false);
        linkedList.add(false);
        linkedList.add(false);
        linkedList.add(true);

        getFirstAndLastOccurence(linkedList);


        //11.

        displayElementsAndPosition(linkedList);


    }

    //1.
    private static LinkedList<Integer> appendElements(LinkedList<Integer> list) {
        list.add(1);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        return list;
    }

    //2.
    private static void iterateThroughLinkedList(LinkedList<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }

    }

    //3.

    private static void iterateFromASpecificPosition(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.listIterator(3);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    //4.

    private static void iterateReverseOrder(LinkedList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    //5.

    private static LinkedList<Integer> insertElementAtPosition(LinkedList<Integer> list) {
        list.add(0, 454);
        list.add(3, 4523);

        return list;
    }

    //6.

    private static LinkedList<String> insertAtBeginningAndEnd() {
        LinkedList<String> words = new LinkedList<>();
        words.add("asd");
        words.add("sfd");
        words.add("dgf45");
        words.addFirst("hey");
        words.addLast("No");

        return words;
    }

    //7.
    private static LinkedList<Double> insertAtFront() {
        LinkedList<Double> doubles = new LinkedList<>();
        doubles.add(23.23);
        doubles.add(345.34);
        doubles.add(34.45);
        doubles.offerFirst(43435.34345);

        return doubles;
    }

    //8.
    private static LinkedList<String> insertAtEnd() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("deader");
        strings.add("sum");
        strings.add("agh");
        strings.offerLast("A");

        return strings;
    }

    //9.
    private static LinkedList<String> insertAtSpecifiedPosition() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("rang");
        strings.add("rad");
        strings.add("sad");
        strings.add("moo");
        strings.add("eh");
        strings.add("red");
        strings.add(3, "haha");
        strings.add(1, "raw");

        return strings;
    }

    //10.

    private static void getFirstAndLastOccurence(LinkedList<Boolean> linkedList) {
        System.out.println(linkedList.getFirst() + " " + linkedList.getLast());
    }

    //11.

    private static void displayElementsAndPosition(LinkedList<Boolean> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) + " At index: " + i);
        }
    }


}
