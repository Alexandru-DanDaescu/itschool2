package session12_polymorphism.practice.compositionoverinherintance.inheritance;

public class Car extends Engine{

    @Override
    void start() {
        System.out.println("Car is moving");
    }
}
