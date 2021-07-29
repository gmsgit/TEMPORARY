import java.lang.*;
import java.util.*;

public class EvenOdd
{
    public static void main(String[] args)
    {
        int x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value: ");
        x=scan.nextInt();
        if(x%2==0)
        {
            System.out.println(x+" is even");
        }
        else 
        {
            System.out.println(x+" is odd");
        }  
    }    
}
