package unit_test;

public class monthely_payment
{

	public static void main(String[] args)
	{
		utility u=new utility ();
		
		int p,y,r;
		System.out.println("enter value of P=AMOUNT Y=TEAR & R=RATE");
		p=u.ReadInteger();
		y=u.ReadInteger();
		r=u.ReadInteger();
		
		double result= u.monthlyPayment(p,y,r);
		//double R=r/1200;
		//double n=12*y;
		
		//double pow =Math.pow((1+R), -n);
		
		//double result=(p*R)/(1-Math.pow((1+R),-n));
		
		System.out.println("result is : "+result);
	}

}
