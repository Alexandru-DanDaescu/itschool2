package session17_streamAndOptional.challenges.stringconcatenation;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> cars = Arrays.asList("BMW","Dacia","Mustang");
        List<String> tanks = Arrays.asList("Abrams","Leopard","T34-85");

        System.out.println(streamConcatenation(cars,tanks));

    }

    private static List<String> streamConcatenation(List<String> firstInput, List<String> secondInput){

        return Stream
                .concat(firstInput.stream(),secondInput.stream())
                .toList();
    }
}
