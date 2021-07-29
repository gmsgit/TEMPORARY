import java.lang.*;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=scan.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is "+"Leap Year");
                }
                else
                {
                    System.out.println(year+" is "+"Not a Leap Year");
                }
            }
            else
            {
                System.out.println(year+" is "+"Leap Year");
            }
        }
        else
        {
            System.out.println(year+" is "+"Not a Leap Year");
        }
    }
}
