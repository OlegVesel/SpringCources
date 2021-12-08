package my.home.genreOfMusic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("rockEbol")
public class RockMusic implements Music {
    @Override
    public void getSong() {
        System.out.println("Rock music");
    }
}
