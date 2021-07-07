import impl.songs.Song;
import lombok.Data;

import java.util.Set;


public class MusicCollection {

    private Set<Song> songSet;

    public Set<Song> getSongSet() {
        System.out.println("Set of Songs: " + songSet);
        return songSet;
    }

    public void setSongSet(Set<Song> songSet) {
        this.songSet = songSet;
    }


}
