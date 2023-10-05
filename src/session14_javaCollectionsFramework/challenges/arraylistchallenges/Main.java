package session14_javaCollectionsFramework.challenges.arraylistchallenges;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        //1.
        List<String> colors = new ArrayList<>();

        System.out.println(colorsList(colors));


        //2.

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(iterateThroughList(numbers));


        //3.

        System.out.println(insertElementAtFirstIndex(numbers));


        //4.



        System.out.println(retrieveSpecifiedElement(numbers,6));

        //5.

        System.out.println(updateList(numbers,4,345));

        //6.

        System.out.println(removeElementFromList(numbers,2));

        //7.

        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("james");
        listOfUserNames.add("Norton");
        listOfUserNames.add("Greg");
        listOfUserNames.add("Jon");

        System.out.println(searchForElement(listOfUserNames,"Greg"));

        //8.

        System.out.println("Sorted list: " + sortList());

        //9.

        System.out.println("Copied list: " + copylist());

        //10.

        System.out.println("Shuffled list: " + shuffleList());

    }

    //1.
    private static List<String> colorsList(List<String> colorsList){
        colorsList.add("Blue");
        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        return colorsList;
    }

    //2.

    private static List<Integer> iterateThroughList(List<Integer> numberList){
        List<Integer> number = new ArrayList<>();
        for(int i : numberList){
            number.add(i);
        }
        return number;
    }

    //3.

    private static List<Integer> insertElementAtFirstIndex(List<Integer> numbersList){
        numbersList.add(0,21);
        numbersList.add(1,32);
        return numbersList;
    }

    //4.

    private static int retrieveSpecifiedElement(List<Integer> list, int target){
        for(int i = 0; i<list.size();i++){
            if(list.get(i) == target){
                return list.get(i);
            }
        }
        return -1;
    }

    //5.

    private static List<Integer> updateList(List<Integer> list, int index, int value){
        list.set(index,value);
        return list;
    }

    //6.

    private static List<Integer> removeElementFromList(List<Integer> list,int target){
        for(int i = 0;i<list.size();i++){
            if(list.get(i) == target){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    //7.

    private static String searchForElement(List<String> listOfNames, String name){
        for (String userName : listOfNames) {
            if (userName.contains(name)) {
                return userName;
            }
        }
        return "Element not found";
    }

    //8.

    private static List<Double> sortList(){
        List<Double> listOfDoubles = new ArrayList<>();
        listOfDoubles.add(32.34);
        listOfDoubles.add(234.542);
        listOfDoubles.add(5.65756);
        listOfDoubles.add(123.43);
        listOfDoubles.add(1.23);
        listOfDoubles.add(654.34);
        listOfDoubles.add(354.4536);
        listOfDoubles.add(321.3124);
        listOfDoubles.add(12.123);
        listOfDoubles.add(10.2345);
        Collections.sort(listOfDoubles);
        return listOfDoubles;
    }

    //9.

    private static List<Double> copylist(){
        List<Double> listToCopy = new ArrayList<>();
        listToCopy.add(5000.43);
        listToCopy.add(5634.354);
        listToCopy.add(34534.45);
        listToCopy.addAll(sortList());
        return listToCopy;
    }

    //10.

    private static List<Double> shuffleList(){
        List<Double> shuffleTheList = new ArrayList<>(copylist());
        Collections.shuffle(shuffleTheList);
        return shuffleTheList;
    }


}
