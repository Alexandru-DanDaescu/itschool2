package session8.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

//        int[] numbers = new int[5];

//        for(int i = 0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }

        //or you can write it like this
//        for(int number : numbers){
//            System.out.println(number);
//        }

        //ctrl + alt + m -> extract code to a new method
        printArraysAverage();

        String[][] names = {{"Ms", "Mr"},
                {"Maria", "John"}};
        printMultidimensionalArray(names);

        int[] numbers = {1, 5, 3, 2, 10};
        System.out.println("Sorted arrays");
        printIntSortedArray(numbers);

        printSortedArray(names[1]);

        printStringSearchResult(names[1], "Maria");
        printIntSearchResult(numbers, 10);

    }

    private static void printArraysAverage() {
        int[] numbers = {1, 4, 5, 8, 10};
        //               0 1 2 3 4
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(numbers[1]); //print 4

        int averageResult = sum / numbers.length;
        System.out.println("Arrays length: " + numbers.length);
        System.out.println("Arrays average " + averageResult);
    }

    public static void printMultidimensionalArray(String[][] names) {
        //System.out.println(names[0][1] + names[1][1]);

        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);        //ctrl + shift  down or up (move selected code)
        for (String input : arrayInput) {
            System.out.print(input);
        }
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);

        for (int input : arrayInput) {
            System.out.print(input);
        }
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput); //research "spliterator"
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

}
