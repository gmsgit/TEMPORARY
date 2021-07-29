import java.lang.*;
import java.util.*;

class Age
{
    public static void main(String[] args) {
        int x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age: ");
        x=scan.nextInt();
        if(x>=14 && x<=55)
        {
            System.out.println("Young Citizen.");
        }
        else
        {
            System.out.println("Senior Citizen.");
        }
    }
}