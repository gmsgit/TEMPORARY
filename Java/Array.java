import java.lang.*;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("Enter array size:");
        a=scan.nextInt();
        int b[]=new int[a];
        System.out.println("Enter array elements:");
        for(int i=0; i<a ;i ++)
        {
            b[i]=scan.nextInt();
        }
        int continueProcess=1;
        while(continueProcess==1)
        {
        System.out.println("::::::::::::::::::::Choose Option::::::::::::::::::::");
        System.out.println("1.Insert Elements");
        System.out.println("2.Delete Elements");
        System.out.println("3.Update Elements");
        int z=scan.nextInt();
        switch (z)
        {
            case 1: int x1, y1;
                    System.out.println("Enter element to insert:");
                    x1=scan.nextInt();
                    System.out.println("Enter index of insertion");
                    y1=scan.nextInt();
                    if(y1<b.length)
                    {
                        System.out.println("Array Size: "+a);
                        System.out.print("Array Elements: ");
                        for(int i=0; i<b.length;i++)
                        {
                        System.out.print(b[i]+", ");
                        }
                        System.out.println("");
                        System.out.println("Insertion Element: "+x1);
                        System.out.println("Insertion Index: "+y1);
                        for(int i=a-1; i>y1; i--)
                        {
                        b[i]=b[i-1];
                        }
                        b[y1]=x1;
                        System.out.print("Processed Array: ");
                        for(int i=0;i<b.length;i++)
                        {
                        System.out.print(b[i]+", ");
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid Index.");
                        break;
                    }

            case 2:     int x2;
                        System.out.println("Enter index of deletion:");
                        x2=scan.nextInt();
                        if(x2<b.length)
                        {
                            System.out.println("Array Size: "+a);
                            System.out.print("Array Elements: ");
                            for(int i=0; i<b.length;i++)
                            {
                                System.out.print(b[i]+", ");
                            }
                            System.out.println("");
                            System.out.println("Deletion Index: "+x2);
                            for(int i=x2;i<b.length-1;i++)
                            {
                                b[i]=b[i+1];
                            }
                            System.out.print("Processed Array: ");
                            for(int i=0;i<b.length-1;i++)
                            {
                            System.out.print(b[i]+", ");
                            }
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Index");
                            break;
                        }


                        
                        
            case 3: int x3, y3;
                    System.out.println("Enter element to update");
                    x3=scan.nextInt();
                    System.out.println("Enter index of updation:");
                    y3=scan.nextInt();
                    if(y3<b.length)
                    {
                        System.out.println("Array Size: "+a);
                        System.out.print("Array Elements: ");
                        for(int i=0; i<b.length;i++)
                        {
                            System.out.print(b[i]+", ");
                        }
                        System.out.println("");
                        System.out.println("Updation Index: "+y3);
                        b[y3]=x3;
                        System.out.print("Processed Array: ");
                        for(int i=0;i<b.length;i++)
                        {
                        System.out.print(b[i]+", ");
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid Index");
                        break;
                    }
        }
        int continuation=1;
        while(continuation==1)
        {
        System.out.println("");
        System.out.println("Would you like to continue processing the array?");
        System.out.println("1[YES] 0[NO]");
        continueProcess=scan.nextInt();
        if(continueProcess!=1 && continueProcess!=0)
        {
            System.out.println("Invalid option, plese try again.");
        }
        else
        {
            break;
        }
        }   
        } 
        if(continueProcess==0)
        {
            System.out.println("Process aborted.");
            System.exit(0);
        }
       
    }
}
