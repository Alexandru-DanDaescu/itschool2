package session12_polymorphism.practice.virtualmethods;

public class Apple extends Fruit{


    @Override
    public String taste(){
        return "Apple is sweet";
    }
    @Override
    public  String color(){
        return "Apple is red";
    }

}
