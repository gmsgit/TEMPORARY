import java.lang.*;
import java.util.*;
public class MaxElement {
    static int max(int x[])
    {
        int max=x[0];
        for(int i=1; i<x.length; i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter array size: ");
         int x=scan.nextInt();
         System.out.println("Enter array elements: ");
         int A[]=new int[x]; 
         for(int i=0; i<A.length; i++)
         {
             A[i]=scan.nextInt();
         }
         for(int i=0; i<A.length; i++)
         {
             System.out.print(A[i]+", ");
         }
         System.out.println("");
         System.out.println("Max element:"+max(A));


         

    }
}
