package session16_lambda.challenges.createnewlist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        List<Integer> integerArrayList = Arrays.asList(-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10);


        CreateList createList = (List<Integer> integerList , IntInput intInput) -> {
            List<Integer> newList = new ArrayList<>();
            for(int number : integerList){
                newList.add(intInput.changeInt(number));
            }
            return newList;
        };

        IntInput positive = input -> Math.abs(input);
        IntInput negative = input -> -Math.abs(input);

        System.out.println("Original list: " + integerArrayList);
        System.out.println("Numbers to positive: " + createList.createNewListFromAnotherList(integerArrayList,positive));
        System.out.println("Numbers to negative: " + createList.createNewListFromAnotherList(integerArrayList,negative));




    }
}
