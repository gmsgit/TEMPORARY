import java.lang.*;
import java.util.*;
public class ArrayArithmetic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int x=scan.nextInt();
        System.out.println("Enter Number of Columns:");
        int y=scan.nextInt();
        int A[][]=new int[x][y];
        int B[][]=new int[x][y];
        int C[][]=new int[x][y];
        System.out.println("Two MATRICES A and B of size "+x+"x"+y+" is created.");
        System.out.println("Enter MATRIX-A Elements:");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter MATRIX-B Elements:");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                B[i][j]=scan.nextInt();
            }
        }
        int continueProcess=1;
        while(continueProcess==1)
        {
        System.out.println("::::::::::::::::::::Choose Option::::::::::::::::::::");
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        int z=scan.nextInt();
        System.out.println("");
        System.out.println("PROCESSED MATRIX:");
        switch (z)
        {
            case 1: for(int i=0; i<C.length; i++)
                    {
                        for(int j=0; j<C[i].length; j++ )
                        {
                            C[i][j]=A[i][j]+B[i][j];
                            System.out.print(C[i][j]+"  ");
                        }
                        System.out.println("");
                    }
                    break;
            
            case 2: for(int i=0; i<C.length; i++)
                    {
                        for(int j=0; j<C[i].length; j++ )
                        {
                            C[i][j]=A[i][j]-B[i][j];
                            System.out.print(C[i][j]+"  ");
                        }
                        System.out.println("");
                    }
                    break;

            case 3: for(int i=0; i<C.length; i++)
                    {
                        for(int j=0; j<C[i].length; j++ )
                        {
                            C[i][j]=A[i][j]*B[i][j];
                            System.out.print(C[i][j]+"  ");
                        }
                        System.out.println("");
                    }
                    break;
        }
        int continuation=1;
        while(continuation==1)
        {
        System.out.println("");
        System.out.println("Would you like to continue process?");
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
