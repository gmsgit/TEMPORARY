import java.lang.*;
import java.util.*;

public class Marks {
    public static void main(String[] args) {
        int MATHEMATICS, PHYSICS, CHEMISTRY, TOTAL;
        float PERCENTAGE;
        Scanner scan=new Scanner(System.in);
        System.out.println("::::::::Enter Your Marks::::::::");
        System.out.println("MATHEMATICS: ");
        MATHEMATICS=scan.nextInt();
        System.out.println("PHYSICS: ");
        PHYSICS=scan.nextInt();
        System.out.println("CHEMISTRY: ");
        CHEMISTRY=scan.nextInt();
        TOTAL=MATHEMATICS+PHYSICS+CHEMISTRY;
        System.out.println("TOTAL MARKS: "+TOTAL);
        PERCENTAGE=(MATHEMATICS+PHYSICS+CHEMISTRY)/3;
        System.out.println("PERCENTAGE: "+PERCENTAGE);
        if(PERCENTAGE>=80)
        {
            System.out.println("GRADE: A");
        }
        else if(PERCENTAGE>=70 && PERCENTAGE<80)
        {
            System.out.println("GRADE: B");
        }
        else if(PERCENTAGE>=60 && PERCENTAGE<70)
        {
            System.out.println("GRADE: C");
        }
        else if(PERCENTAGE>=50 && PERCENTAGE<60)
        {
            System.out.println("GRADE: D");
        }
        else if(PERCENTAGE>=40 && PERCENTAGE<50)
        {
            System.out.println("GRADE: E");
        }
        else
        
        {
            System.out.println("GRADE: F");
        }
    }
    
}
