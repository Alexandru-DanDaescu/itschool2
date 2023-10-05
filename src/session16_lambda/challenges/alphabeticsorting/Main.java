package session16_lambda.challenges.alphabeticsorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("Boston", "Massachusetts", "Philadelphia", "Pennsylvania", "Washington",
                "Chicago", "Illinois");


        cityNames.forEach(city -> Collections.sort(cityNames));

        for(String name : cityNames){
            System.out.println(name);
        }

    }
}
