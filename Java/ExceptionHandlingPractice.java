import java.lang.*;
import java.util.*;

class StackOverFlow extends Exception
{
    public String toString()
    {
        return "STACK OVERFL0W";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "STACK UNDERFL0W";
    }
}

class Stack
{
    private int size;
    private int top=-1;
    private int S[];

    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }

    public void push(int x)throws StackOverFlow
    {
        if(top==size-1)
        throw new StackOverFlow();
        top++;
        S[top]=x;
    }

    public int pop()throws StackUnderFlow
    {
        int x=-1;
        if(top==-1)
        throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;
    }


}
public class ExceptionHandlingPractice {
    
    public static void main(String[] args) {
        Stack STACK=new Stack(5);
        try
        {
        STACK.push(10);
        STACK.push(20);
        STACK.push(10);
        STACK.push(20);
        STACK.push(10);
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        
        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
        catch(StackUnderFlow s)
        {
            System.out.println(s);
        }
    }
}
