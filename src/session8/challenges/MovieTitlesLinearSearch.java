package session8.challenges;

public class MovieTitlesLinearSearch {


    public static void main(String[] args) {
        //8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
        // If it does, print out its position in the array.

        String[] movieTitles = {"Escape Room", "Rust Creek", "American Hangman", "A Dog's Way Home", "The Upside", "Replicas",
                "After Darkness", "Glass"};

        System.out.println(linearSearch(movieTitles, "American Hangman"));


    }

    public static String linearSearch(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                return array[i] + " found at position " + i;
            }
        }
        return "Element not found";
    }

    //Other ways to do this exercise.
    /*
    public static void linearSearch(String[] array, String value) {
        int flag = 0;
        int i;
        for(i = 0;i<array.length;i++){
            if(value.equals(array[i])){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Element found at position "+ i);
        }
        else {
            System.out.println("Element not found");
        }
    }
     */


}
