import java.lang.*;
import java.util.*;
public class Methods {
    static boolean prime(int n)
    {
        for(int i=2; i<(n/2); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter value: ");
         int x=scan.nextInt();
         prime(x);
         if(prime(x)==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }

    }
}
