package impl.songs;

import lombok.Data;

@Data
public class Song {

    private String title;
    public Song(String title){
        this.title = title;
    }



    public void newSong(){
        System.out.println("... song ... " + title);
    }
}
