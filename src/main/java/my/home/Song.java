package my.home;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.Random;
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
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

        this.length =  new Random().nextInt(20);
    }

    public void destroyMethod(){
        System.out.println("this is destroy method");
    }

}
