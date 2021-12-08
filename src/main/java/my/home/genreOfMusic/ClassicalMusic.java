package my.home.genreOfMusic;

import java.util.Random;

public class ClassicalMusic implements Music {
    private String[] songs = {"classical music 1", "classical music 2", "classical music 3"};
    @Override
    public String getSong() {
        return songs[new Random().nextInt(3)];
    }
}
