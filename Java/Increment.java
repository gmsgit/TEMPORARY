import java.lang.*;
import java.util.*;
public class Increment 
{
    public static void main(String[] args) {
        int x,y,z;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x value: ");
        x=scan.nextInt();
        y=x++;
        z=++x;
        System.out.println(y);
        System.out.println(z);
    }
}
