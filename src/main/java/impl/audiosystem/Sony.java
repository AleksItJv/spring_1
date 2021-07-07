package impl.audiosystem;

import impl.songs.Song;
import interfaces.Audiosystem;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Sony implements Audiosystem {

    private String name = "Sony Music";
    private Set<Song> playlist;

    public Sony() {
    }

    public Sony(Set<Song> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return name;
    }
}
