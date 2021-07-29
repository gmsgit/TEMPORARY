import java.lang.*;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n, factorial=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value: ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial of "+n+" is "+factorial);
    }
}
