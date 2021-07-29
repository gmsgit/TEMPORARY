import java.lang.*;
import java.util.*;
public class AreaTriangle
{
    public static void main(String[] args)
    {
        float base, height, area;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter base value: ");
        base=scan.nextFloat();
        System.out.println("Enter height value: ");
        height=scan.nextFloat();
        area=(float)0.5*base*height;
        System.out.println("Area of Triangle is: " + area);
    }
}
