import java.lang.*;
import java.util.*;
public class GeometricProgression
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter initial value:");
        int a=scan.nextInt();
        System.out.println("Enter ratio value:");
        int r=scan.nextInt();
        System.out.println("Enter number of values:");
        int n=scan.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print(a+",");
            a=a*r;
        }
    }
}