package unit_test;
import java.util.*;

public class day_of_weak
{
  public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  utility u=new utility();
	  System.out.println("enter number of day month and year");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
	  int rseult= u.dayofweek(a,b,c);
	  System.out.println("day of weak is : "+rseult);
	  
	}

}
