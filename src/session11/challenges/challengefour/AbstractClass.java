package session11.challenges.challengefour;

public abstract class AbstractClass {

    abstract void a_method();

    protected AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    protected void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }

}
