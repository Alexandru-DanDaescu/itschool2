package session10_inheritanceAndEncapsulation.practice.animalproblem;

public class Main {

    public static void main(String[] args) {

        Mammal mammal = new Mammal("Wolf");
        mammal.eat();

        Bird bird = new Bird("Sparrow");
        bird.eat();

        Fish fish = new Fish("Piranha");
        fish.eat();

    }
}
