package session15.challenges.personequalshashcode;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Alex");
        person1.setAge(24);

        Person person2 = new Person();
        person2.setName("Alex");
        person2.setAge(24);

        System.out.println(person1.equals(person2));

        System.out.println("Person1: " + person1.hashCode());
        System.out.println("Person2: " + person2.hashCode());

    }
}
