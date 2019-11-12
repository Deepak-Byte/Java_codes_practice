package myname;
import java.util.*;
public class leapyear
{

	public static void main(String[] args)
	{
		char order;
	  Scanner sc=new Scanner(System.in);
	  do {
	      System.out.println("ENTER YOR YEAR NEED TO PROCES");
	       int year=sc.nextInt();
	        if(year%4==0 && (year%400==0||year!=0))
	        {
	      	  System.out.println("the entered year is leap year");
	        }
	       else 
	         {
		       System.out.println("it is  not leap year");
	         }
	    System.out.println("DO WANT TO CONTINUE TO CHECK  type Y");
	    order=sc.next().charAt(0);
	        // console.next().charAt(0);
	  }
	  
	  while((order == 'y') || ( order== 'Y'));
	  
	}
	
	}


