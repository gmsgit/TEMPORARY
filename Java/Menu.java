import java.lang.*;
import java.util.*;
public class Menu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("===============MENU==============");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("MOD");
        System.out.println("Enter two numbers: ");
        int x=scan.nextInt();
        int y=scan.nextInt();
        scan.nextLine();
        System.out.println("Type your Option");
        String option=scan.nextLine();
        option=option.toUpperCase();
        switch (option) {
            case "ADD":System.out.println(x+y);
                break;
            case "SUB":System.out.println(x-y);
                break;
            case "MUL":System.out.println(x*y);
                break;
            case "DIV":System.out.println(x/y);
                break;
            case "MOD":System.out.println(x%y);
                break;
            default: System.out.println("Invalid Option."); 
                break;
        }

    }
}
