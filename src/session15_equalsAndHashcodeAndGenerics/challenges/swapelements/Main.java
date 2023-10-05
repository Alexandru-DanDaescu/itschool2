package session15_equalsAndHashcodeAndGenerics.challenges.swapelements;

import java.util.Arrays;

public class Main {

    private static <T> void swap(T[] array, int i, int j){
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {

        String[] words = {"Cat","Cucumber"};

        System.out.println("Before: " + Arrays.toString(words));

        swap(words,0,1);

        System.out.println("After: " + Arrays.toString(words));

    }

}
