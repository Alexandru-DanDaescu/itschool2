package session10_inheritanceAndEncapsulation.challenges.challengesonetofive;


//  5. Create a TestAnimal Class with a main method,
//  create objects with each animal class created (dog, cat, wolf) and call sound()

public class TestAnimal {

    public static void main(String[] args) {

//  1. Create an Animal class with sound() method that prints to console “animal makes sounds”

        Animal animal = new Animal();
        animal.sound();

//  2. Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound,
//  so we want to print “bark”, in this case

        Dog dog = new Dog();
        dog.sound();

//  3. Create a Cat class that extends Animal and overrides sound() method, and in this case,
//  we want to print in our method “meow”

        Cat cat = new Cat();
        cat.sound();

//  4. Create a Wolf class that extends Animal, and overrides sound() method, and print “how”
        Wolf wolf = new Wolf();
        wolf.sound();

    }
}
