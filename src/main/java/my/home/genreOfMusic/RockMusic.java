package my.home.genreOfMusic;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component("rockEbol")
public class RockMusic implements Music {
    private String[] songs = {"Rock music 1", "Rock music 2", "Rock music 3"};
    @Override
    public String getSong() {
        return songs[new Random().nextInt(3)];
    }
}
