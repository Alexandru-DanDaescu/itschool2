package session15_equalsAndHashcodeAndGenerics.challenges.songlibrary;

import java.util.Objects;

public class Song {

    private String title;
    private String artistName;
    private double songLength;


    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Song song = (Song) obj;
        return Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getArtistName(), song.getArtistName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getArtistName());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }
}
