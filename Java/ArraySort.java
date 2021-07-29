import java.lang.*;
import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int x=scan.nextInt();
        String array[]=new String[x];
        System.out.println("Enter strings:");
        for(int i=0; i<array.length; i++)
        {
            array[i]=scan.next();
        }
        System.out.println("Sorted Array:");
        java.util.Arrays.sort(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}
