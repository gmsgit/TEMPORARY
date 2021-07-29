import java.lang.*;
import java.util.*;
public class Method {
    static int gcd(int x, int y)
    {
        while(x!=y)
        {
            if(x>y)
            {
                x=x-y;
            }
            else
            {
                y=y-x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter two value: ");
         int x=scan.nextInt();
         int y=scan.nextInt();
         int z=gcd(x, y);
         System.out.println("GCD is:"+z);

    }
}
