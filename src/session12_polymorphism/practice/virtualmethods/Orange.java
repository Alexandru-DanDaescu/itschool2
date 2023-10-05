package session12_polymorphism.practice.virtualmethods;

public class Orange extends Fruit{

    @Override
    public String taste(){
        return "orange is sour";
    }

    @Override
    public String color(){
        return "Orange is orange";
    }

}
