package session12_polymorphism.practice.compositionoverinherintance.composition;

public class Car {

    private Engine engine;

    Car (Engine engine){
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

}
