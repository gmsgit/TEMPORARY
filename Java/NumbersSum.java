import java.lang.*;
import java.util.*;

public class NumbersSum {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value: ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
    }
}
