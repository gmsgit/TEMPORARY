import java.lang.*;
import java.util.*;
public class SquareRoot
{
    public static void main(String[] args)
    {
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value:");
        a=scan.nextInt();
        a=(int) Math.sqrt(a);
        System.out.println("Square Root is: " + a);
    }
}
