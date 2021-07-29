import java.lang.*;
import java.util.*;

public class StringPractice {

    public static void main(String[] args) {
    String str1="Java";
    String str2="Java";
    System.out.println(str1==str2);/* true as both str1,str2 refer to objects in a pool*/
    String str3="Java";
    String str4=new String("Java");
    System.out.println(str3==str4);/* false as str3 refers to object in heap and str4 refers to object in a pool*/
    }
}
