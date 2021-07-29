import java.lang.*;
import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        int i, n, x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter table number:");
        n=scan.nextInt();
        for(i=1; i<11; i++)
        {
            x=i*n;
            System.out.println(n+" * "+i+" = "+x);
        }
    }
}
