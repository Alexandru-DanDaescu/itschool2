package session15_equalsAndHashcodeAndGenerics.challenges.genericrepository;

public class Main {

    public static void main(String[] args) {

        Repository<Integer> integerRepository = new Repository<>();
        integerRepository.put(1, 234);
        integerRepository.put(2,400);

        Repository<String> stringRepository1 = new Repository<>();
        stringRepository1.put(1,"Test");
        stringRepository1.put(2,"Value");

        Repository<String> stringRepository2 = new Repository<>();
        stringRepository1.put(1,"Test");
        stringRepository1.put(2,"Value");

        System.out.println(stringRepository1.equals(integerRepository));
        System.out.println(stringRepository1.equals(stringRepository2));

        System.out.println();

        System.out.println(stringRepository1.hashCode());
        System.out.println(stringRepository2.hashCode());
        System.out.println(integerRepository.hashCode());


    }
}
