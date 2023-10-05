package session14_javaCollectionsFramework.challenges.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //1.

        Map<Integer, String> names = new HashMap<>();

        addElements(names);

        //2.

        System.out.println(returnMapSize(names));

        //3.

        Map<Integer, String> firstMap = new HashMap<>();
        firstMap.put(1, "der");
        firstMap.put(2, "ab");
        firstMap.put(3, "bc");
        firstMap.put(4, "cd");

        Map<Integer, String> secondMap = new HashMap<>();
        secondMap.put(5, "raw");
        secondMap.put(6, "chicken");
        secondMap.put(7, "pork");
        secondMap.put(8, "raw");

        System.out.println(copyMappings(firstMap, secondMap));

        //4.

        Map<Integer, Double> anotherMap = new HashMap<>();
        anotherMap.put(1, 34.34);
        anotherMap.put(2, 43556.23);
        anotherMap.put(3, 3445.543);

        System.out.println(removeAllElements(anotherMap));

        //5.
        System.out.println(isMapEmpty(anotherMap));

        //6.

        Map<Integer, String> thirdMap = new HashMap<>();
        thirdMap.put(1, "a");
        thirdMap.put(2, "b");
        thirdMap.put(3, "c");
        thirdMap.put(4, "d");

        Map<Integer, String> fourthMap = new HashMap<>();
        fourthMap.put(5, "d");
        fourthMap.put(6, "f");
        fourthMap.put(7, "g");
        fourthMap.put(8, "h");

        System.out.println(copyMap(thirdMap, fourthMap));

        //7.
        Map<Integer, String> fifthMap = new HashMap<>();
        fifthMap.put(1, "ame");
        fifthMap.put(2, "read");
        fifthMap.put(3, "no");
        fifthMap.put(4, "yes");

        System.out.println(mapContainsKey(fifthMap));

        //8.

        System.out.println(mapContainsValue(fifthMap));

        //9.

        Map<Integer, String> sixthMap = new HashMap<>();
        sixthMap.put(1, "12");
        sixthMap.put(2, "13");
        sixthMap.put(3, "14");
        sixthMap.put(4, "15");

        Set<?> set = sixthMap.entrySet();

        System.out.println("//9. " + set);

        //10.

        String value = sixthMap.get(3);
        System.out.println("//10. " + value);

        //11.

        Set<Integer> keySet = sixthMap.keySet();
        System.out.println("//11. " + keySet);

        //12.

        System.out.println("//12. " + sixthMap.values());


    }

    //1.
    private static void addElements(Map<Integer, String> map) {
        map.put(1, "John");
        map.put(2, "Red");
        map.put(3, "Mary");
        System.out.println(map);
    }

    //2.
    private static int returnMapSize(Map<Integer, String> map) {
        return map.size();
    }

    //3.
    private static Map<Integer, String> copyMappings(Map<Integer, String> firstMap, Map<Integer, String> secondMap) {
        firstMap.putAll(secondMap);
        return firstMap;
    }

    //4.

    private static Map<Integer, Double> removeAllElements(Map<Integer, Double> map) {
        map.clear();
        return map;
    }

    //5.

    private static boolean isMapEmpty(Map<Integer, Double> map) {
        return map.isEmpty();
    }

    //6.
    private static Map<Integer, String> copyMap(Map<Integer, String> firstMap, Map<Integer, String> secondMap) {
        secondMap = new HashMap<>(firstMap);
        return secondMap;
    }

    //7.

    private static boolean mapContainsKey(Map<Integer, String> map) {
        boolean found = false;
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(i)) {
                found = true;
                break;
            }
        }
        return found;
    }

    //8.
    private static boolean mapContainsValue(Map<Integer, String> map) {
        for (int i = 0; i < map.size(); i++) {
            if (map.containsValue("ame") || map.containsValue("read") || map.containsValue("no")) {
                return true;
            }
        }
        return false;
    }

    //9.

    //10.
}
