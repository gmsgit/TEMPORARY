import java.lang.*;
import java.util.*;

public class website {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter URL: ");
        String url=scan.nextLine();
        String protocol=url.substring(0, url.indexOf(":"));
        String domain=url.substring(url.lastIndexOf("."));

        if(protocol.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        else
        {
            System.out.println("Invalid url.");
        }

        if(domain.equals(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(domain.equals(".org"))
        {
            System.out.println("Organisation Website");
        }
        else if(domain.equals(".gov"))
        {
            System.out.println("Government Website");
        }
        else
        {
            System.out.println("Unknown domain type.");
        }
    }
}
