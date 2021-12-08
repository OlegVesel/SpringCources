package my.home;

import java.util.Random;
public class Song {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private Song() {
    }

    public static Song factoryMethod(){
        Song song = new Song();
        song.setLength(15);
        System.out.println("this is factory method");
        return song;
    }

    public void initMethod(){
        System.out.println("this is init method");

        this.length =  new Random().nextInt(15);
    }

    public void destroyMethod(){
        System.out.println("this is destroy method");
    }

}
