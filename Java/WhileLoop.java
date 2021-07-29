import java.lang.*;
import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter maximum value for powers of 2:");
        int n=scan.nextInt();

        while(i<n)
        {
            System.out.println(i);
            i=i*2;
        }
    }
}
