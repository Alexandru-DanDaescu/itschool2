package session16_lambda.practice;

import java.util.Arrays;
import java.util.List;

public class ListAndLambda {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Heckler","Koch");
        //for enhanced loop
        for(String name : names){
            System.out.println(name);
        }

        //lambda

        names.forEach(name -> System.out.println(name));

        //stream

        names.stream()
                .filter(name -> name.startsWith("H"))
                .forEach(name -> System.out.println(name));
    }
}
