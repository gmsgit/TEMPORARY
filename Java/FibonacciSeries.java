import java.lang.*;
import java.util.*;
public class FibonacciSeries
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter initial values a, b:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Enter number of values:");
        int n=scan.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print(a+",");
            int f=a+b;
            a=b;
            b=f;
        }
    }
}