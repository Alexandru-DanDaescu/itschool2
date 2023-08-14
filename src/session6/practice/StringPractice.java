package session6.practice;

import session6.practice.PracticeUser;

public class StringPractice {

    public static void main(String[] args) {

        String animal1 = "lion";
        String animal2 = new String("Lion");
        String animal3 = "lion";

        System.out.println(animal1 == animal2);
        System.out.println(animal1 == animal3);

        System.out.println("animal1 "+Integer.toHexString(System.identityHashCode(animal1)));
        System.out.println("animal2 "+Integer.toHexString(System.identityHashCode(animal2)));
        System.out.println("animal3 "+Integer.toHexString(System.identityHashCode(animal3)));

        garbageCollectorExample();
        stringConcat();
        System.out.println(getStringLength(animal1));
        System.out.println(animal1.length());

        System.out.println(getStringChar(animal1,1));
        System.out.println(animal1.indexOf('i'));

        String name = "AdrianPuscuta";

        System.out.println(name.substring(6,13));
        System.out.println(name.substring(6));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(getStringStartsWith(name, "adrian"));
        System.out.println(getStringEndsWith(name, "Puscuta"));

        String sentence = "          I like to eat apple pie.          ";
        System.out.println(sentence.contains("apple"));

        System.out.println(sentence.replace('a', 'b'));

        System.out.println(sentence.trim());

        sentence = sentence.trim()
                .replace('a','x')
                .toUpperCase();

        System.out.println(sentence);

    }

    public static void garbageCollectorExample(){
        String name = "Andrei";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);

        PracticeUser practiceUser = new PracticeUser();
        practiceUser.setName("Ionut");

        practiceUser = new PracticeUser();

    }

    public static void stringConcat(){
        String value1 = "Adrian";
        String value2 = "Puscuta";
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));    //ctrl + shift (move lines);
        value1 = value1.concat(value2);

        System.out.println(Integer.toHexString(System.identityHashCode(value2)));

    }

    public static int getStringLength(String input){
        return input.length();
    }

    public static char getStringChar(String input, int index){
        return input.charAt(index);
    }

    public static boolean getStringStartsWith(String input, String startsWith){
        return input.startsWith(startsWith);
    }

    public static boolean getStringEndsWith(String input, String endsWith){
        return input.endsWith(endsWith);
    }




}
