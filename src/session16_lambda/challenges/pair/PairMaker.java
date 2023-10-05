package session16_lambda.challenges.pair;

@FunctionalInterface
public interface PairMaker<K,V>{

    Pair<K,V> makePair(K key, V value);



}
