package session14_javaCollectionsFramework.challenges.hashset;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1.
        Set<String> strings = new HashSet<>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        strings.add("test4");
        strings.add("test5");
        strings.add("test6");
        strings.add("test7");

        System.out.println(strings);

        //2.
        printElements(strings);

        //3.

        getNumberOfElements(strings);

        //4.

        System.out.println(emptyHashSet(strings));

        //5.
        System.out.println(isHashSetEmpty(strings));

        //6.

        Set<Integer> firstSetOfNumbers = new HashSet<>();
        firstSetOfNumbers.add(1);
        firstSetOfNumbers.add(2);
        firstSetOfNumbers.add(123);
        firstSetOfNumbers.add(1234);

        Set<Integer> secondSetOfNumbers = new HashSet<>();
        secondSetOfNumbers.add(5);
        secondSetOfNumbers.add(3);
        secondSetOfNumbers.add(456);
        secondSetOfNumbers.add(7890);

        System.out.println(cloneHashSet(firstSetOfNumbers,secondSetOfNumbers));

        //7.

        convertHashSetToArray(firstSetOfNumbers);

        //8.
        System.out.println();
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

        System.out.println(convertToTreeSet(integerSet));

        //9.

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        convertToArrayList(set);

        //10.

        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(23.34);
        doubleSet.add(13.44);
        doubleSet.add(2.34);
        doubleSet.add(3.34);
        Set<Double> doubleSet1 = new HashSet<>();
        doubleSet1.add(4.105);
        doubleSet1.add(14.5);
        doubleSet1.add(11.25);
        doubleSet1.add(10.45);

        System.out.println(compareHashSets(doubleSet,doubleSet1));

        //11.

        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("first");
        stringHashSet.add("second");
        stringHashSet.add("third");
        stringHashSet.add("cat");
        stringHashSet.add("rat");

        Set<String> secondStringHashSet = new HashSet<>();
        secondStringHashSet.add("first");
        secondStringHashSet.add("second");
        secondStringHashSet.add("third");

        compareAndRetainElements(stringHashSet,secondStringHashSet);

        //12.

        removeAllElements(stringHashSet);

    }

    //2.

    private static void printElements(Set<String> stringSet){
        for (String iterator : stringSet){
            System.out.println(iterator);
        }
    }

    //3.

    private static void getNumberOfElements(Set<String> stringSet){
        System.out.println(stringSet.size());
    }

    //4.

    private static Set<String> emptyHashSet(Set<String> stringSet){
        stringSet.removeAll(stringSet);
        return stringSet;
    }

    //5.

    private static boolean isHashSetEmpty(Set<String> stringSet){
        return  stringSet.isEmpty();
    }

    //6.

    private static Set<Integer> cloneHashSet(Set<Integer> firstSet, Set<Integer> secondSet){
        Set<Integer> clone = new HashSet<>(firstSet);
        clone.addAll(secondSet);
        return clone;
    }

    //7.

    private static void convertHashSetToArray(Set<Integer> integerSet){
        int[] array = new int[integerSet.size()];
        int i = 0;
        for(int element : integerSet){
            array[i++] = element;
        }
        for(int j : array){
            System.out.print(j+" ");
        }
    }

    //8.
    private static Set<Integer> convertToTreeSet(Set<Integer> set){
        return new TreeSet<>(set);
    }

    //9.
    private static void convertToArrayList(Set<String> set){
        List<String> convert = new ArrayList<>(set);
        System.out.println(convert);
    }

    //10.

    private static boolean compareHashSets(Set<Double> firstSet, Set<Double> secondSet){
        return firstSet.equals(secondSet);
    }

    //11.

    private static void compareAndRetainElements(Set<String> firstSet, Set<String> secondSet){
        firstSet.retainAll(secondSet);
        System.out.println(firstSet);
    }

    //12.

    private static void removeAllElements(Set<String> set){
        set.clear();
        System.out.println(set);
    }

}
