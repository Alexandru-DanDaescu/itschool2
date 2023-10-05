package session15_equalsAndHashcodeAndGenerics.practice.musicstreamingservice;

public class Song {

    private String name;

    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void playSong(){
        System.out.println("The song is playing " + name + " from " + artist);
    }


}
