import java.lang.*;
import java.util.*;
public class SwitchCase2 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter URL: ");
    String url=scan.nextLine();
    String extension=url.substring(url.lastIndexOf("."));
    switch(extension)
    {
        case ".com":System.out.println(url+" is a commercial website.");
                    break;
        case ".org":System.out.println(url+" is a organisation website.");
                    break;
        case ".gov":System.out.println(url+" is a government website.");
                    break;
        default:System.out.println(url+" is a unknown website.");
                    break;
    }


    }
}
