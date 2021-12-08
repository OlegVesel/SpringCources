package my.home;

import my.home.genreOfMusic.Music;
import my.home.genreOfMusic.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MusicPlayer {
    @Autowired
    private RockMusic music;

    private List<Music> listMusic;

    private Set<Integer> tons;

    private Map<String, String> settings;

    private int volume;
    private String name;

    private Song song;

    public MusicPlayer(){

    }

    public MusicPlayer(RockMusic music) {
        this.music = music;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Music> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public Set<Integer> getTons() {
        return tons;
    }

    public void setTons(Set<Integer> tons) {
        this.tons = tons;
    }

    public Map<String, String> getSettings() {
        return settings;
    }

    public void setSettings(Map<String, String> settings) {
        this.settings = settings;
    }

    public void viewSettings(){
        getSettings().forEach((a, b) -> System.out.println(a+b));
    }

    public void viewTons(){
        getTons().forEach(System.out::println);
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(RockMusic music) {
        this.music = music;
    }

    public void playMusic() {
        getListMusic().forEach(Music::getSong);
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "listMusic=" + listMusic +
                ", tons=" + tons +
                ", settings=" + settings +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", song=" + song +
                '}';
    }
}
