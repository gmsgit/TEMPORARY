import java.lang.*;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value:");
        int n=scan.nextInt();
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==m)
        {
            System.out.println(m+" is Armstrong Number.");
        }
        else
        {
            System.out.println(m+" is not Armstrong Number.");
        }
    }
}
