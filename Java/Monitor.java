import java.lang.*;
import java.util.*;

class Data
{
    synchronized public void display(String str)
    {
        {
            for(int i=0; i<str.length(); i++)
            {
                System.out.println(str.charAt(i));
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    } 

}
class ThreadOne extends Thread
{
    Data d;
    public ThreadOne(Data d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class ThreadTwo extends Thread
{
    Data d;
    public ThreadTwo(Data d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Welcome All");
    }
}
public class Monitor
{
    public static void main(String[] args) {
        Data DATA=new Data();
        ThreadOne TO=new ThreadOne(DATA);
        ThreadTwo TT=new ThreadTwo(DATA);
        TO.start();
        TT.start();
    }
}