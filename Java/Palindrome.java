import java.lang.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value:");
        int n=scan.nextInt();
        int m=n;
        int r, rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a paindrome");
        }
    }
}
