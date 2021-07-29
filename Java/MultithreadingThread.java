import java.lang.*;
import java.util.*;

class  ThreadClass extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class MultithreadingThread {
    public static void main(String[] args) {
        ThreadClass TC=new ThreadClass();
        TC.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
