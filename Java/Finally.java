import java.lang.*;
import java.util.*;

public class Finally {
    static void meth1()throws Exception
    {
    try
    {
        throw new Exception();
    }
    finally
    {
        System.out.println("FINALLY MESSAGE.");
    }
}
    public static void main(String[] args)throws Exception {
        meth1();
    }
}
