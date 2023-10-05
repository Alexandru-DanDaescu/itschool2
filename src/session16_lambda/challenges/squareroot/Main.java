package session16_lambda.challenges.squareroot;

public class Main {

    public static void main(String[] args) {


        MathematicalOperation mathematicalOperation = (number -> Math.sqrt(number));

        System.out.println(mathematicalOperation.calculateSquareRoot(34.34));

    }
}
