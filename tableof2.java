package myname;
import java.util.*;
public class tableof2
{

	public static void main(String[] args)
	{
	int a;
	char choice;
	Scanner sc=new Scanner (System.in);
	do {
	System.out.println("how far u want table of 2 :-");
	a=sc.nextInt();
	
	  for(int i=0;i<a;i++)
	    {
		  int k=(int) Math.pow(2, i);
		  System.out.println(" "+k);
	    }
	System.out.println("do you want to continue type y"); 
	choice=sc.next().charAt(0);
	}
	while((choice=='Y')||(choice=='y'));
	
	
	
	}

}
