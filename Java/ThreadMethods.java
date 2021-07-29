import java.lang.*;
import java.util.*;

class ThreadMethod extends Thread
{
    public ThreadMethod(String x)
    {
        super(x);
        setPriority(ThreadMethod.MAX_PRIORITY);
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i++);
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        ThreadMethod TM=new ThreadMethod("LOOP");
        TM.setDaemon(true);
        TM.start();
    }
}
