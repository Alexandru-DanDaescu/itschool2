package session17_streamAndOptional.challenges.filterprimenumbers;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(primeNumbers(100));




    }

    private static List<Integer> primeNumbers(int numbers){
        return IntStream
                .rangeClosed(2,numbers) //rangeClosed increments from our specified parameters (from 2 to 100 as an example)
                .filter(Main::isPrime)
                .boxed()                //an autoboxing is done here I think?
                .toList();

    }

    private static boolean isPrime(int number){
        return number > 1 && IntStream
                .range(2,number) // checks whether the numbers in the provided range are prime
                .noneMatch(i -> number % i == 0);
    }


}
