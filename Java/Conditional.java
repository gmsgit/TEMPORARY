import java.lang.*;
import java.util.*;

class Conditional
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter values: ");
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
        if(x>y && x>z)
        {
            System.out.println("The value "+x+" is greatest.");
        }    
        else if(y>z)
        {
            
            System.out.println("The value "+y+" is greatest.");
        }
        else
        {
            System.out.println("The value "+z+" is greatest.");
        }
    }
}