package session15_equalsAndHashcodeAndGenerics.challenges.songlibrary;

public class Main {

    public static void main(String[] args) {

        Song song1 = new Song();
        song1.setTitle("Title");
        song1.setArtistName("Name");

        Song song2 = new Song();
        song2.setTitle("Title");
        song2.setArtistName("Name");

        System.out.println(song1.equals(song2));

        System.out.println("Song1: " + song1.hashCode());
        System.out.println("Song2: " + song2.hashCode());

    }
}
