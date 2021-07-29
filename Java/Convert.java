import java.lang.*;
import java.util.*;

class Convert
{
	public static void main(String args[])
	{
	int x,y;
	Scanner scan=new Scanner(System.in);
	x=scan.nextInt();
	y=scan.nextInt();
	System.out.println(Integer.toBinaryString(x));
	System.out.println(Integer.toOctalString(x));
	System.out.println(Integer.toHexString(x));
	System.out.println(Integer.toBinaryString(y));
	System.out.println(Integer.toOctalString(y));
	System.out.println(Integer.toHexString(y));

	}
}