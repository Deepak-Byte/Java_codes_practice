package unit_test;
import java.util.*;

public class note_conversion
{
	 
	
	 static void notesuck (int a)
	  {  
		  //int t[]= {2000,500,100,50,10,5,2,1}; 
		  if (a!=0)
		  {
			  
			  int count=0;
			  switch(count)
			  {
			  case 0:
				      int k=a/2000;
		              int b=a%2000;
		              System.out.println("number  of 2000 note essuid will be : "+k); 
		              count++;
		              notesuck (b);  
			  case 1:
			          int k1=a/500;
	                  int b1=a%500;
	                  System.out.println("number  of 500 note essuid will be : "+k1); 
	                  count++;
	                  notesuck (b1);  
	                  
	                  
			  case 2:
		          int k2=a/100;
                  int b2=a%100;
                  System.out.println("number  of 100 note essuid will be : "+k2); 
                  count++;
                  notesuck (b2);  
                          
	                  
			  case 3:
		          int k3=a/50;
                  int b3=a%50;
                  System.out.println("number  of 50 note essuid will be : "+k3); 
                  count++;
                  notesuck (b3);  
                          
	                  
	                  
			  case 4:
		          int k4=a/10;
                  int b4=a%10;
                  System.out.println("number  of 10 note essuid will be : "+k4); 
                  count++;
                  notesuck (b4);  
                         
	                  
	                  
			  case 5:
		          int k5=a/5;
                  int b5=a%5;
                  System.out.println("number  of 5 note essuid will be : "+k5); 
                  count++;
                  notesuck (b5); 
                  
			  case 6:
		          int k6=a/2;
                  int b6=a%2;
                  System.out.println("number  of 2 note essuid will be : "+k6); 
                  count++;
                  notesuck (b6);    
                  
			  case 7:
		          int k7=a/1;
                  int b7=a%1;
                  System.out.println("number  of 1 note essuid will be : "+k7); 
                  count++;
                  notesuck (b7);     
                  
			default:
				break;
			
                  
             }
	      }
		  
	  }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int a1;
		
		System.out.println("enter your amount :");
		a1=sc.nextInt();
	    notesuck (a1); 
   }
}
