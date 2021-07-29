import java.lang.*;
import java.util.*;

class phone
{
    public void call()
    {
        System.out.println("CALL FEATURE");
    }
    public void sms()
    {
        System.out.println("SMS FEATURE");
    }
}

interface camera
{
    void capture();
    void record();    
}
interface mediaPlayer
{
    void play();
    void pause();
    void stop();
}

class smartPhone extends phone implements camera, mediaPlayer
{
    public void call()
    {
        System.out.println("SMARTPHONE CALL");
    }
    public void capture()
    {
        System.out.println("CAPTURE FEATURE");
    }
    public void record()
    {
        System.out.println("RECORD FEATURE");
    }
    public void play()
    {
        System.out.println("PLAY FEATURE");
    }
    public void pause()
    {
        System.out.println("PAUSE FEATURE");
    }
    public void stop()
    {
        System.out.println("STOP FEATURE");
    }
}

public class Interface {
    public static void main(String[] args) {
       System.out.println(":::::::::::::::::::SMARTPHONE::::::::::::::::::");
        smartPhone SMARTPHONE=new smartPhone();
        SMARTPHONE.call();
        SMARTPHONE.sms();
        SMARTPHONE.capture();
        SMARTPHONE.record();
        SMARTPHONE.play();
        SMARTPHONE.pause();
        SMARTPHONE.stop();
        System.out.println(":::::::::::::::::::PHONE::::::::::::::::::");
        phone PHONE=new phone();
        PHONE.call();
        PHONE.sms();
        System.out.println(":::::::::::::::::::CAMERA::::::::::::::::::");
        camera CAMERA=new smartPhone();
        CAMERA.capture();
        CAMERA.record();
        System.out.println("::::::::::::::::MEDIAPLAYER::::::::::::::::::");
        mediaPlayer MEDIAPLAYER=new smartPhone();
        MEDIAPLAYER.play();
        MEDIAPLAYER.pause();
        MEDIAPLAYER.stop();
    }
}