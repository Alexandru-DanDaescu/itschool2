package session10_inheritanceAndEncapsulation.practice.animalproblem;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("The fish is eating plankton");
    }


}
