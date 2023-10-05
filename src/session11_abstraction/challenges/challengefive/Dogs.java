package session11_abstraction.challenges.challengefive;

public class Dogs extends Animals{


    @Override
    protected void cats() {
        System.out.println("Cats meow");
    }

    @Override
    protected void dogs() {
        System.out.println("Dogs bark");
    }
}
