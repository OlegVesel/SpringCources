package my.home.genreOfMusic;

import java.util.Random;

public class RapMusic implements Music {
    private String[] songs = {"Rap music 1", "Rap music 2", "Rap music 3"};
    @Override
    public String getSong() {
        return songs[new Random().nextInt(3)];
    }
}
