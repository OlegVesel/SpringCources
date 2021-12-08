package my.home;

import my.home.genreOfMusic.Music;
import my.home.genreOfMusic.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(TypeOFMusic.CLASSICAL);
        System.out.println(musicPlayer.getSong().getLength());

        context.close();
    }
}
