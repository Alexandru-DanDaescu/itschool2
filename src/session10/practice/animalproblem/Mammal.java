package session10.practice.animalproblem;

public class Mammal extends Animal{

    public Mammal(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("The mammal is eating plants or other animals");
    }


}