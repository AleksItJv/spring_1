import impl.audiosystem.Sony;
import impl.car.Audi;
import impl.car.BMW;
import impl.songs.Song;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        /**
         * AnnotationConfigApplicationContext--- */

/*        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Audi audi1 = ctx.getBean(Audi.class);
        Audi audi2 = ctx.getBean(Audi.class);
        Song song = ctx.getBean("rock", Song.class);
        Song song2 = ctx.getBean("relax", Song.class);
        Song songs = ctx.getBean("songsMusic", Song.class);

        songs.newSong();
        song.newSong();
        song2.newSong();
        audi2.setColor("blue");
        V6 v6 = ctx.getBean(V6.class);
        audi1.move();

        System.out.println(audi1);
        System.out.println(audi2);*/

/*-----------------------------------------------------------
-----------------------------------------------------------*/

        /**
         * ClassPathXmlApplicationContext--- */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfig.xml");

        BMW bmw = ctx.getBean(BMW.class);
        Audi audi1 = ctx.getBean("audi2012", Audi.class);
        Audi audi2 = ctx.getBean("audi2012", Audi.class);
        Audi audi3 = ctx.getBean("audi2015", Audi.class);
        Audi audi4 = ctx.getBean("audi2015", Audi.class);
        Sony sony = ctx.getBean(Sony.class);
        Song song1 = ctx.getBean("rock", Song.class);
        Song song2 = ctx.getBean("relax", Song.class);
        //MusicCollection musicCollection = ctx.getBean("songSet", MusicCollection.class);

        //musicCollection.getSongSet();

        System.out.println(sony.getPlaylist());

        audi1.move();
        System.out.println(audi1);
        System.out.println(audi2);
        System.out.println(audi3);
        System.out.println(audi4);
        audi2.setColor("black");
        audi3.setColor("red");
        System.out.println();
        System.out.println(audi1);
        System.out.println(audi2);
        System.out.println(audi3);
        System.out.println(audi4);
        //System.out.println(bmw);

    }
}
