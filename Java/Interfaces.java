import java.lang.*;
import java.util.*;

interface Member
{
    void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;

    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0; i<count; i++)
        {
            members[i].callback();
        }
    }
}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Store STORE=new Store();
        Customer CUSTOMER1=new Customer("MADHU");
        Customer CUSTOMER2=new Customer("SUDHAN");
        STORE.register(CUSTOMER1);
        STORE.register(CUSTOMER2);
        STORE.inviteSale();
    }
}
