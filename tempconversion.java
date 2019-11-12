package unit_test;
import java.util.*;

public class tempconversion 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in)	;
	  int a;
	  System.out.println("1 : for degree to farenhite press 1");
	  System.out.println("2 : for farenhite to degree press 2");
	  a=sc.nextInt ();
	  switch(a)
	  {
	  case 1:System.out.println("enter your temp in degree ");
	         double b=sc.nextInt();
	         double result=b*(9/5)+32;
		     System.out.println(result);
		     
	  case 2:System.out.println("enter your temp in farenhite ");
             double c=sc.nextInt();
             double result2=(c-32)*5/9;
	         System.out.println(result2);    
		
	  default:
		     System.out.println("no such conversion exist");
		     
		     
	  }

	}

}
