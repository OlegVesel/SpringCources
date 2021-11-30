package my.home;

import my.home.genreOfMusic.Music;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MusicPlayer {
    private List<Music> listMusic;

    private Set<Integer> tons;

    private Map<String, String> settings;

    private int volume;
    private String name;

    public MusicPlayer() {
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

    public void playMusic() {
        getListMusic().forEach(Music::getSong);
    }
}
