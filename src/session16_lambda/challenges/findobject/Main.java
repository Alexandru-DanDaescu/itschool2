package session16_lambda.challenges.findobject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListObjectFinder objectFinder = ((list, item) -> list.contains(item));

        List aList = new ArrayList<>();

        aList.add(20);
        aList.add('C');
        aList.add("Something");
        aList.add(Character.SIZE);


        System.out.println(objectFinder.findObjectInList(aList, 'C'));


    }
}
