import java.lang.*;
import java.util.*;

class rectangle
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    } 
    public void setLength(Double l)
    {
        if(l>=0)
        length=l;
        else
        length=0;
    }
    public void setBreadth(Double b)
    {
        if(b>=0)
        breadth=b;
        else
        breadth=0;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        return length==breadth;
    }
    
}
public class OOP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        rectangle rectangle1=new rectangle();
        System.out.println("Enter length and breadth values: ");
        rectangle1.setLength(10.0);
        rectangle1.setBreadth(10.0);

        System.out.println("AREA1: "+rectangle1.area());
        System.out.println("PERI1: "+rectangle1.perimeter());
        System.out.println("Square: "+rectangle1.isSquare());

        System.out.println("Length: "+rectangle1.getLength());
        System.out.println("Breadth: "+rectangle1.getBreadth());
    }
}