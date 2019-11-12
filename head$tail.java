package myname;
import myname.utility.*;
public class head$tail 
{

	public static void main(String[] args)
	{
		utility u=new utility();
		System.out.println("Enter the trail..");
		int trail=u.ReadInteger();
		
	    Object a[]=u.IsFlipCoin(trail);
	    
	    System.out.println("Head : "+a[0]);
	    System.out.println("Head : "+a[1]);
		 
	    System.out.println("Head Percentage : "+a[2]);
		 
	    System.out.println("Tail  Percentage: "+a[3]);
		 

	}

}
