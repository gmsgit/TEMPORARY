import java.lang.*;
import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter range of numbers:");
        int i=scan.nextInt();
        int n=scan.nextInt();

        do
        {
            System.out.println(i);
            i++;
        }
        while(i<n);
    }
}
