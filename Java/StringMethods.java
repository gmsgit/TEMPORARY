import java.lang.*;
import java.util.*;
public class StringMethods
{
    public static void main(String args[])
    {
        System.out.println("Enter your email : ");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int i=str.indexOf("@");
        String userName=str.substring(0, i);
        String domain=str.substring(i+1, str.length());
        System.out.println("Username : "+userName);
        System.out.println("Domain : "+domain);
        System.out.println("Address of gmail: "+domain.equals("gmail.com"));
    }
}