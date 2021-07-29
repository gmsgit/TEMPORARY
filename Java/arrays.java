import java.lang.*;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
       int A[]={1,2,3,4,5};
       for(int i=0;i<A.length;i++)
       {
            System.out.print(A[i]+", "); 
       }
       int B[]=new int[A.length*2];
       for(int i=0;i<A.length;i++)
       {
           B[i]=A[i];
       }
       A=B;
       B=null;
       System.out.println("");
       for(int i=0;i<A.length;i++)
       {
       System.out.print(A[i]+",");
       }
    }
}
