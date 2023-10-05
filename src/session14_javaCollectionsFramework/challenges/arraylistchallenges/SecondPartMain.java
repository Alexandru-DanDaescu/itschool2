package session14_javaCollectionsFramework.challenges.arraylistchallenges;

import java.util.*;

public class SecondPartMain {

    public static void main(String[] args) {

        //11.

        List<String> listOfCars = new ArrayList<>();
        listOfCars.add("Ferrari");
        listOfCars.add("Bugatti");
        listOfCars.add("Opel");
        listOfCars.add("Ford");
        listOfCars.add("Nissan");

        System.out.println(reverseElements(listOfCars));

        //12.

        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(6);
        listOfNumbers.add(8);
        listOfNumbers.add(10);
        listOfNumbers.add(12);
        listOfNumbers.add(14);

        System.out.println(extractAPortionOfArray(listOfNumbers));


        //13.

        System.out.println(compareLists());

        //14.

        System.out.println(swapElements(listOfNumbers));

        //15.

        System.out.println(joinLists(listOfNumbers));

        //16.
        System.out.println(cloneList());

        //17.

        emptyList(listOfNumbers);

        //18.
        System.out.println(isListEmpty(listOfCars));

        //19.

        List<String> letters = new ArrayList<>();
        letters.add("A     ");
        letters.add("         AB ");
        letters.add("                   AC         ");
        letters.add("  AG   ");
        letters.add("     AED");
        letters.add("               AHI");

        System.out.println(trimList(letters));


        //20.
        ArrayList<Integer> placeHolderName = new ArrayList<>();
        placeHolderName.add(12);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);
        placeHolderName.add(342);


        System.out.println("Before: " + placeHolderName.size());
        System.out.println("After: "+ increaseArrayCapacity(placeHolderName));


    }

    //11.

    private static List<String> reverseElements(List<String> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }


    //12.

    private static List<Integer> extractAPortionOfArray(List<Integer> list) {
        return list.subList(0, 4);
    }

    //13.

    private static boolean compareLists() {
        List<Double> firstList = new ArrayList<>();
        firstList.add(23.23);
        firstList.add(10.1);
        firstList.add(22343.453);
        firstList.add(673.783);
        firstList.add(123.78987);
        firstList.add(432.34);

        List<Double> secondList = new ArrayList<>();
        secondList.add(10.23);
        secondList.add(10.45);
        secondList.add(3.453);
        secondList.add(7.133);
        secondList.add(13.87);
        secondList.add(42.14);

        return firstList.equals(secondList);

    }

    //14.

    private static List<Integer> swapElements(List<Integer> list){
        Collections.swap(list,3,4);
        return list;
    }

    //15.

    private static List<Integer> joinLists(List<Integer> list){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(15);
        integerList.add(25);
        integerList.add(30);
        integerList.add(35);

        List<Integer> mergeLists = new ArrayList<>();
        mergeLists.addAll(list);
        mergeLists.addAll(integerList);

        return mergeLists;

    }


    //16.

    private static List<Integer> cloneList(){
        List<Integer> firstOriginalList = Arrays.asList(1,2,3,4,5,6);
        List<Integer> secondOriginalList = Arrays.asList(1,2,3,4,5,6);

        List<Integer> clonedList = new ArrayList<>();

        clonedList.addAll(firstOriginalList);
        clonedList.addAll(secondOriginalList);

        return clonedList;
    }

    //17.

    private static void emptyList(List<Integer> list){
        list.clear();
        System.out.println(list);
    }

    //18.

    private static boolean isListEmpty(List<String> list){
        return list.isEmpty();
    }

    //19.

    private static List<String> trimList(List<String> list){
        List<String> trim = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
           trim.add(list.get(i).toString().trim());
        }
        return trim;
    }

    //20.

    private static int increaseArrayCapacity(ArrayList<Integer> list){
        list.ensureCapacity(15);
        return list.size();
    }


}
