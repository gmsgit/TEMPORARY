import java.lang.*;
import java.util.*;
public class ObjectOverloadig {
   static void varargs(double ...x)
   {
       if(x.length==0)
       {
           System.out.println("No arguments passed.");
       }
       else
       {
       double sum=0;
       for(int i=0; i<x.length; i++)
       {
           sum=sum+x[i];
       }
       double discount=0;
       double bill=0;
       if(sum>=3000 && sum<5000)
       {
           discount=sum/10;
           bill=sum-discount;
       }
       else if(sum>=5000 && sum<10000)
       {
        discount=sum/15;
        bill=sum-discount;
       }
       else
       {
        discount=sum/25;
        bill=sum-discount;
       }
       System.out.println("Total: "+sum);
       System.out.println("Discount: "+discount);
       System.out.println("Bill: "+bill);
    }
   }

   public static void main(String[] args) {
       varargs(500,400,250,3000);
       
   } 
}
