package myname;
import myname.utility.*;
public class factorofprime
{

	public static void main(String[] args) 
	{
		utility u=new utility();
		System.out.println("Enter the Number");
		int num=u.ReadInteger();
		System.out.println("Factor of Prime Number");
		
		System.out.println(u.Primefactor(num));


	}

}
