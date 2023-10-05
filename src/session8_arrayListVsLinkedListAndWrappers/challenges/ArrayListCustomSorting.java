package session8_arrayListVsLinkedListAndWrappers.challenges;

import java.util.*;

public class ArrayListCustomSorting {

    public static void main(String[] args) {

//  7. Create an ArrayList containing names of fruits.
//  Implement a custom sorting mechanism to arrange them in descending order based on their length.
//  If two fruits have the same length, sort them in alphabetical order.

        Scanner scanner = new Scanner(System.in);

        List<String> fruitList = new ArrayList<>();

//  Here is a list of fruits which you can use : "Banana","Orange","Melon","Apple","Pear","Cherry","Coconut","Lemon",
//  "Mango","Pineapple","Grape","Avocado","Watermelon","Raspberry","Kiwi"
        System.out.println("Enter the length of the arraylist first." +
                "\nAfter that, enter the fruits that you want to be sorted depending on their length.");
        int arrayListLength = scanner.nextInt();
        for (int i = 0; i < arrayListLength; i++) {
            fruitList.add(scanner.next());
        }

        System.out.println(customSorting(fruitList));


    }

    public static List<String> customSorting(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() != list.get(j).length()) {
                    list.sort(Collections.reverseOrder());
                    break;
                }
                else {
                    Collections.sort(list);
                }
            }
        }
        return list;
    }

}
