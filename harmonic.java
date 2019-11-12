package myname;
import myname.utility.*;
public class harmonic 
{
   public static void main(String[] args) 
	{
	   utility u=new utility();
		System.out.println("Enter The Range");
		int number=u.ReadInteger();
	    double arr[]	=u.isharmonicNumber(number);
	    double sum=0;
		for(double i=1;i<=arr.length;i++)
		{
			System.out.println("1 /" +i);
			sum+=i;
		}
		System.out.println("Print the "+ number +" Harmonic Value :" +sum);	
	}

}
