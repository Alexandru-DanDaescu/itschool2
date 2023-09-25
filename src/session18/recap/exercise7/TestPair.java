package session18.recap.exercise7;

import java.util.ArrayList;

public class TestPair {

    public static void main(String[] args) {

        Pair<StringBuilder, ArrayList> pair = new Pair<>(new StringBuilder("a"), new ArrayList<>());

        pair.getKey().append("b");

        System.out.println(pair);


    }
}
