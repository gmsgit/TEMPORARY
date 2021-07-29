import java.lang.*;
import java.util.*;

class Outer
{
    int x=10;
    class Inner
    {
        int y=20;

        public void innerMethod()
        {
            System.out.println("Accessed granted for InnerMethod!!!"+"\n"+x+"&"+y);
        } 
    }
    public void outerMethod()
    {
        System.out.println("Accessed granted for OuterMethod!!!"+"\n"+x);
        Inner I=new Inner();
        I.innerMethod();
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer.Inner OI=new Outer(). new Inner();
        OI.innerMethod();
        
    }
}
