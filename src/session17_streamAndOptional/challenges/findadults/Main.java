package session17_streamAndOptional.challenges.findadults;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("John","Doe",15),
                new Person("Alice","Wesson",20),
                new Person("Jason","Monroe",25));

        System.out.println(filterByAge(people));



    }

    private static List<Person> filterByAge(List<Person> personListInput){

        return personListInput.stream()
                .filter(person -> person.getAge() > 18 )
                .toList();

    }

}
