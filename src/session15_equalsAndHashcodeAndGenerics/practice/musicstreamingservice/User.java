package session15_equalsAndHashcodeAndGenerics.practice.musicstreamingservice;

import java.util.Collections;
import java.util.List;

public class User {

    private String userName;

    private List<Song> playList;

    private boolean isShuffled;

    public User(String userName) {
        this.userName = userName;

    }

    public void addToPlayList(Song song){
        playList.add(song);
    }

    public void shuffle(){
        Collections.shuffle(playList);
        isShuffled = true;
    }

    public void playPlaylist(){
        for(Song song : playList){
            song.playSong();
        }
    }

    public void repeatSong(Song song, boolean isRepeatable){
        while (isRepeatable){
            song.playSong();
        }
    }

}
