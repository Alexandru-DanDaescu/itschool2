package session8.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityNamesArrayList {

    public static void main(String[] args) {

//  5. Create an ArrayList that stores city names. Add at least five city names initially.
//  Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate.
//  Otherwise, add it to the list.
        Scanner scanner = new Scanner(System.in);

        List<String> cityNames = new ArrayList<>();
        cityNames.add("New York");
        cityNames.add("Los Angeles");
        cityNames.add("Houston");
        cityNames.add("Chicago");
        cityNames.add("Alaska");

        System.out.println("Enter a length for the list.");
        int arrayListLength = scanner.nextInt();
        System.out.println("Enter a city name that is not in the current list");
        for (int i = 0; i < arrayListLength; i++) {
            String cities = scanner.nextLine();
            if (cities.contains("New York") || cities.contains("Los Angeles") || cities.contains("Houston")
                    || cities.contains("Chicago") || cities.contains("Alaska")) {
                System.out.println("This city name is a duplicate");
                break;
            }
            else {
                cityNames.add(cities);
            }

        }
        System.out.println(cityNames);


    }
}
