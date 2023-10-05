package session16_lambda.challenges.pair;

public class Main {

    public static void main(String[] args) {

        PairMaker<Object,Object> pairMaker = ((key, value) -> new Pair<>(key,value));

        System.out.println(pairMaker.makePair(1,"alex").toString());
        System.out.println(pairMaker.makePair(2.0, String.valueOf(40)));
        System.out.println(pairMaker.makePair(3,Integer.MAX_VALUE).toString());
    }
}
