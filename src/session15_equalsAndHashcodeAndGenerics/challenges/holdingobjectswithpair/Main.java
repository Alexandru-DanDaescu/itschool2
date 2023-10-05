package session15_equalsAndHashcodeAndGenerics.challenges.holdingobjectswithpair;



public class Main {

    public static void main(String[] args) {

        Helmet helmet = new Helmet("model",23);
        Hammer hammer = new Hammer("model here",12);

        Pair<Object,Object> pair = new Pair<>(helmet,hammer);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


    }

}
