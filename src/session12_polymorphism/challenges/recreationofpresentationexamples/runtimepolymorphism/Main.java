package session12_polymorphism.challenges.recreationofpresentationexamples.runtimepolymorphism;

public class Main {

    public static void main(String[] args) {

        AsphaltTools asphaltTools;

        asphaltTools = new JackHammer("Insert jackhammer name here","BobCat","2010-05-12");
        System.out.println(asphaltTools);

        asphaltTools = new Tarmac("Insert tarmac name here","Diamond Driveways","2013-01-07");
        System.out.println(asphaltTools);


    }
}
