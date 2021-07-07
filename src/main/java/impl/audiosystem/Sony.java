package impl.audiosystem;

import impl.songs.Song;
import interfaces.Audiosystem;
import lombok.Data;
import java.util.Map;

@Data
public class Sony implements Audiosystem {

    private String name = "Sony Music";
    private Map<String, Song> playlist;

    public Sony() {
    }

    public Sony(Map<String, Song> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return name;
    }
}
