package session16.practice.lambda;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (( input,condition) ->{
            if(condition){
                System.out.println(input);
            }
        });
        conditionalPrinter.print("Hello John", true);
        conditionalPrinter.print("Hello John", false);
    }
}
