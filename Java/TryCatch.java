import java.lang.*;
import java.util.*;


public class TryCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int x=scan.nextInt();
        int A[]=new int[x];
        System.out.println("Enter values:");
        for(int i=0; i<A.length; i++ )
        {
            A[i]=scan.nextInt();
        }
        try
        {
            int c=A[1]/A[2];
            System.out.println(c);
            try
            {
                System.out.println(A[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Message: Invalid index."+"\nError: "+e);
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Message: Cannot divide by zero."+"\nError: "+e);
        }
        System.out.println("Program successfully terminated.");
    }
}