package session12.practice.compositionoverinherintance.composition;

public class TestCarComposition {

    public static void main(String[] args) {

        Engine carEngine = new Engine();
        Car Car = new Car(carEngine);
    }
}
