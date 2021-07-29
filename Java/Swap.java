import java.lang.*;
import java.util.*;

public class Swap 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x, y;
        System.out.println("Enter x value:");
        x=scan.nextInt();
        System.out.println("Enter y value:");
        y=scan.nextInt();
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("Swapped Values:"+"x="+x+" "+"y="+y);
    }
}
