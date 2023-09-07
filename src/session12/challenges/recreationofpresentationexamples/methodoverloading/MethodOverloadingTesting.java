package session12.challenges.recreationofpresentationexamples.methodoverloading;

public class MethodOverloadingTesting {

    public static void main(String[] args) {

        Bank bankOne = new Bank("Dan",1.34,2.54,3.54,4.65);

        System.out.println(bankOne.toStringTwo());

        //If you want to print the sum of integers, change all the numbers to int, and then print bankOne without the toStringTwo


    }

}
