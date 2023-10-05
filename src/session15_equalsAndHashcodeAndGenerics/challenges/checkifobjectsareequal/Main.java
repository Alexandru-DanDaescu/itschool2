package session15_equalsAndHashcodeAndGenerics.challenges.checkifobjectsareequal;


import java.sql.Timestamp;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        Cars cars = new Cars();
        Lamborghini lamborghini1 = new Lamborghini("name",Timestamp.from(Instant.now()));
        Opel opel1 = new Opel("name",Timestamp.from(Instant.now()));
        Lamborghini lamborghini2 = new Lamborghini("rad",Timestamp.from(Instant.now()));
        Opel opel2 = new Opel("E",Timestamp.from(Instant.now()));

        cars.addLamborghini(lamborghini1);
        cars.addLamborghini(lamborghini2);
        cars.addOpel(opel1);
        cars.addOpel(opel2);

        System.out.println(lamborghini1.equals(lamborghini2));
        System.out.println(opel1.equals(opel2));



    }
}
