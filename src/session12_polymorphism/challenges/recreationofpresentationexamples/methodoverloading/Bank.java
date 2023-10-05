package session12_polymorphism.challenges.recreationofpresentationexamples.methodoverloading;

public class Bank {

    private String accountHolderName;
    private int numberOne;
    private int numberTwo;
    private int numberThree;
    private int numberFour;

    private double doubleNumberOne;
    private double doubleNumberTwo;
    private double doubleNumberThree;

    private double doubleNumberFour;

    public Bank() {

    }

    public Bank(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Bank(String accountHolderName, int numberOne, int numberTwo) {
        this.accountHolderName = accountHolderName;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }

    public Bank(String accountHolderName, int numberOne, int numberTwo, int numberThree) {
        this.accountHolderName = accountHolderName;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;

    }

    public Bank(String accountHolderName, int numberOne, int numberTwo, int numberThree, int numberFour) {
        this.accountHolderName = accountHolderName;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.numberFour = numberFour;

    }

    public Bank(String accountHolderName, double doubleNumberOne, double doubleNumberTwo) {
        this.accountHolderName = accountHolderName;
        this.doubleNumberOne = doubleNumberOne;
        this.doubleNumberTwo = doubleNumberTwo;

    }

    public Bank(String accountHolderName, double doubleNumberOne, double doubleNumberTwo, double doubleNumberThree) {
        this.accountHolderName = accountHolderName;
        this.doubleNumberOne = doubleNumberOne;
        this.doubleNumberTwo = doubleNumberTwo;
        this.doubleNumberThree = doubleNumberThree;

    }

    public Bank(String accountHolderName, double doubleNumberOne, double doubleNumberTwo, double doubleNumberThree, double doubleNumberFour) {
        this.accountHolderName = accountHolderName;
        this.doubleNumberOne = doubleNumberOne;
        this.doubleNumberTwo = doubleNumberTwo;
        this.doubleNumberThree = doubleNumberThree;
        this.doubleNumberFour = doubleNumberFour;

    }


    private int sum(int one, int two) {
        return one + two;
    }

    private int sum(int one, int two, int three) {
        return one + two + three;
    }

    private int sum(int one, int two, int three, int four) {
        return one + two + three + four;
    }

    private double sum(double one, double two) {
        return one + two;
    }

    private double sum(double one, double two, double three) {
        return one + two + three;
    }

    private double sum(double one, double two, double three, double four) {
        return one + two + three + four;
    }


    @Override
    public String toString() {
        return "Name of the client:  " + accountHolderName +
                "\nInteger sum: " + "\n" + String.format("%d", sum(numberOne, numberTwo))
                + "\n" + String.format("%d", sum(numberOne, numberTwo, numberThree))
                + "\n" + String.format("%d", sum(numberOne,numberTwo,numberThree,numberFour));
    }

    public String toStringTwo(){
        return "Name of the client: " + accountHolderName +
                "\nDouble sum: " + "\n" + String.format("%.2f", sum(doubleNumberOne, doubleNumberTwo))
                + "\n" + String.format("%.2f", sum(doubleNumberOne, doubleNumberTwo, doubleNumberThree))
                + "\n" + String.format("%.2f", sum(doubleNumberOne, doubleNumberTwo, doubleNumberThree, doubleNumberFour));
    }

}
