import java.lang.*;
import java.util.*;
public class ArrayMatrix {
    public static void main(String[] args) {
        int A[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
