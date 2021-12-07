package my.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.hashCode());
        System.out.println(musicPlayer.getSong().getLength());

        context.close();
    }
}
