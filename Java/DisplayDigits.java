import java.lang.*;
import java.util.*;

public class DisplayDigits {
    public static void main(String[] args) {
        int r;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value:");
        int n=scan.nextInt();
        while(n>0)
        {
            r=n%10;
            System.out.println(r);
            n=n/10;
        }

    }
}
