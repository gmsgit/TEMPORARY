import java.lang.*;
import java.util.*;

public class StringMethods1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        str=str.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
    
}
