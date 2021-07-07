import impl.audiosystem.Sony;
import impl.car.Audi;
import impl.engine.V6;
import impl.engine.V8;
import impl.songs.Song;
import interfaces.Audiosystem;
import interfaces.Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public Audi getAudi(@Qualifier("V6") Engine engine, Audiosystem audiosystem) {

        return new Audi(engine, audiosystem);
    }

    @Bean
    @Qualifier("V6")
    public Engine getV6() {
        return new V6();
    }

    @Bean
    @Qualifier("V8")
    public Engine getV8() {
        return new V8(8);
    }

    @Bean
    public Audiosystem getAs() {
        return new Sony();
    }

    @Bean("relax")
    public Song getRelaxSong(){
        return new Song("Relax");
    }
    @Bean("rock")
    public Song getRockSong(){
        return new Song("Rock");
    }

    @Bean("songsMusic")
    public List<Song> getMusic(){
        List<Song> songs = new ArrayList<>();
        Song[] songsCreate = {new Song("rock"), new Song("relax"), new Song("shanson"), new Song("pop")};
        songs = Arrays.asList(songsCreate);

        return songs;
    }
}
