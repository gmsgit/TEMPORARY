import java.lang.*;
import java.util.*;
class Student
{
    public int id;
    public String name;
    public String course;
    public int m1, m2, m3;

    public String details()
    {
        return "\n"+"ID: "+id+"\n"+"NAME: "+name+"\n"+"COURSE: "+course;
    }

    public double total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public String result()
    {
        if(average()>=55)
        return "PASS";
        else
        return "FAIL";
    }

}
public class ClassObjects{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Student Student1=new Student();
        System.out.println("Enter ID: ");
        Student1.id=scan.nextInt();
        System.out.println("Enter NAME: ");
        scan.nextLine();
        Student1.name=scan.nextLine();
        System.out.println("Enter COURSE:");
        Student1.course=scan.nextLine();
        System.out.println("Enter marks:");
        Student1.m1=scan.nextInt();
        Student1.m2=scan.nextInt();
        Student1.m3=scan.nextInt();
        System.out.println("DETAILS: "+Student1.details());
        System.out.println("TOTAL: "+Student1.total());
        System.out.println("AVERAGE: "+Student1.average());
        System.out.println("RESULT: "+Student1.result());
        
    }
}
