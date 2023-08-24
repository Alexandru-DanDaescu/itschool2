package session8.challenges;

public class EvenOddNumbers {

    public static void main(String[] args) {

//   4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even = 0;
        int odd = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("The count of even numbers are : " + even + "\nThe count of odd numbers  are : " + odd);


    }
}
