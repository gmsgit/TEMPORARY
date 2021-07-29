import java.lang.*;
import java.util.*;
class RunnableInterface implements Runnable
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
public class MultithreadingRunnable {
    public static void main(String[] args) {
        RunnableInterface RI=new RunnableInterface();
        Thread T=new Thread(RI);
        T.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
