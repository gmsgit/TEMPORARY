import java.lang.*;
import java.util.*;

class Scholar
{
    private String roll;
    private String name;
    private String course;

    private static int count=1;
    private String generateRoll()
    {
        String r="LPU"+"2021"+count;
        count++;
        return r;
    }

    public Scholar(String n, String c)
    {
        roll=generateRoll();
        name=n;
        course=c;
    }
    public void details()
    {
        System.out.println("ROLL: "+roll+"\n"+"NAME: "+name+"\n"+"COURSE: "+course);
    }
}

public class Static
{
    public static void main(String[] args) {
        Scholar S1=new Scholar("GADDAM MADHUSUDHAN", "B.TECH CSE HONORS");
        Scholar S2=new Scholar("NATHURAM GODSE", "B.A ASSASINATION");
        S1.details();
        S2.details();
    }
}