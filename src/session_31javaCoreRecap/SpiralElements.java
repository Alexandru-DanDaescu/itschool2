package session_31javaCoreRecap;


//5. Write a program that takes a 2D array (matrix) of m x n elements and prints all the elements of the matrix in spiral order.
//
//        Example:
//        Input:
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//        Output: 1 2 3 6 9 8 7 4 5

import java.util.Arrays;
import java.util.List;

public class SpiralElements {

    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] result = flipPotato(array);

        for (int[] a : result) {
            System.out.println(Arrays.toString(a));
        }


        while (array.length >= 1){
            System.out.println(Arrays.toString(array[0]));
            int[][] newArray = new int[array.length - 1][];

            for(int i = 1; i < array.length;i++){
                for (int j = 0; j < array[i].length; j++) {
                    if(newArray[i-1] == null ){
                        break;
                    }
                    newArray[i-1][j] = array[i][j];
                }
            }

            newArray = flipPotato(newArray);
        }


    }

    public static int[][] flipPotato(int[][] potato){
        if(potato[0] == null){
            return new int[0][0];
        }
        int[][] flippedPotato = new int[potato[0].length][];

        for (int columnIndex = potato[0].length - 1; columnIndex >= 0; columnIndex--) {
            int[] temp = new int[potato[0].length];
            for (int rowIndex = 0; rowIndex < potato.length; rowIndex++) {
                temp[rowIndex] = potato[rowIndex][columnIndex];
            }
            flippedPotato[potato[0].length - columnIndex - 1] = temp;
        }
        return flippedPotato;
    }
}
