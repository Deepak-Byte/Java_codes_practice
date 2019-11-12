package unit_test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class utility {
	
	
static Scanner scanner=new Scanner(System.in);
	
/**********************Integer Scanner*******************************/
	
	/**
	 * @return   Read Integer value of User
	 */
	public  int  ReadInteger()
	{
		return scanner.nextInt();
	}
	
	
	
/**********************String Scanner*******************************/
	

	/**
	 * @return   Read String value of User
	 */
	public  String  ReadString()
	{
		return scanner.nextLine();
	}
	
	
	
	

/**********************Double Scanner*******************************/
	

	/**
	 * @return   Read Double value of User
	 */
	public  double  ReadDouble()
	{
		return scanner.nextDouble();
	}
/*--------------------	Functional program --------------------------*/
	
	
	
/********************** 1. Replace String*******************************/
	
	
	public String replacestring(String input)
	{
		
		String org[]= "Hello <<UserName>> , How are <<UserName>>   you?".split(" ");
	    
	      String result = "";
	      for(int i=0;i<org.length;i++)
	      {
	          if(org[i].matches("<<UserName>>"))
	          {
	        	  org[i]=input;
	        	  
	          }
	          result=result+org[i]+" ";

	      }
	        	
		
		return result;
		
	}
	
/*************************2. flip coin*************************************/
	
	/**
	 * @param time   How many time want to play
	 * @return 
	 */
	public Object[]  IsFlipCoin(int time)
	{
		int Head=0,Tail=0;
		Double HeadPer;
		for(int i=0;i<time;i++)
		{
			if (Math.random() > 0.5) 
			{
				Head++;
			}
			else 
			{
				Tail++;
			}
		}
		
		HeadPer=(double) ((Head/Tail)*100);
		Double TailPer=(HeadPer-100);
	
		
	    Object[] a= {Head,Tail,HeadPer,TailPer};
		
		return a;
		
		
	}	
	
	
/*************************3. Leap Year*************************************/
		
	/**
	 * @param Year   User give Year
	 * @return       Final result output
	 */
	public int CheckLeapyear(int Year)
	{
		
		if(Year%4==0 &&(Year%400==0 || Year!=0) )
		{
		  return 1;	
		  
		}
		else {
			
			return 0;
		}
				
	}

/************************* 4. Power of 2 *************************************/

	/**
	 * @param number how many time user want powerof2
	 */
	public int[] ispowerof2(int number) 
	{
		int arr[] = new int[number];
		int size = 0;
		for (int i = 1; i < number; i++)
		{
			if (Math.pow(2, i) <= Math.pow(number, i))
			{
				int m = (int) Math.pow(2, i);

				arr[size] = m;
				size++;
				
			} else
			{
				break;
			}
		}
		return arr;
	}
		
/*************************5. Harmonic Number*************************************/

	/**
	 * @param number   User give Integer Input
	 * @return         Final result
	 */
	public double[] isharmonicNumber(int number) {

		int k = 0;
		double[] a = new double[number];
		double sum = 0.0;
		for (int i = 1; i <= number; i++) {

			sum += 1.0 / i;

			a[k] = (Double) sum;
			k++;
		}
		return a;
	}
		   
			
/*************************6. Prime Factor*************************************/
			
			/**
			 * @param number   User give  Integer Input
			 * @return         final output
			 */
			public int Primefactor(int number)
			{		
				for(int i=2;i<number;i++)
				{
					while(number%i==0)
					{
						System.out.print(i+" ");
				        number/=i;
				     				
					}
				}		
				if(number>2)
				{
					 return number;
				}
				return number;
			}
			
/*************************7.   Gambler    *************************************/
			
			
	/**
	 * @param stake      user give stake Integer Value
	 * @param goal       user give Goal  Integer Value
	 * @param trail      User play How many time
	 * @return           Final result
	 */
	public Object[] gambler(int stake, int goal, int trail)
	{
		int win = 0, loss = 0, bet = 0, cash;
		Double WinPer, LosePer;

		for (int i = 0; i < trail; i++) 
		{
			cash = stake;
			while (cash > 0 && cash < goal)
			{
				bet++;
				if (Math.random() > 0.5) 
				{
					cash++;
				} else 
				{
					cash--;
				}
			}
		   if(cash==goal)
		   {
			   win++;
		   }
		   else 
		   {
			 loss++;   
		   }
		}
		
		WinPer = (double) (win * 100 / trail);
		LosePer = 100 - WinPer;
		
		
		return new Object[] {win,loss,WinPer,LosePer};
	}
	
/*************************8. Coupon Number*************************************/
		  
		  
		  /**
		 * @param num     User give Integer Input
		 * @return        Final output
		 */
		public int  IsCouponNumber(int num)
		  {
			int max=10;
			int count=0;
			for(int i=0;i<num;i++)
			{
				String str="";
			
			for(int j=0;j<10;j++)
			{
				double d=Math.random();
				count++;
				int random=(int) (d*max);
				str +=random;
			}
			System.out.println(str);
			}
		      return  count;
			  
		  }	
		
/*************************9. 2D Array*************************************/
		
	
		public static int[][] arrayInt(int m, int n)
		{
			int a[][] = new int[m][n];
			System.out.println();
			System.out.println("Integer Array");

			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					a[i][j] = scanner.nextInt();
				}
			}
			return a;
		}
		
		
		
		public static double[][] arrayDouble(int m, int n)
		{
			double b[][] = new double[m][n];
			System.out.println();
			System.out.println("Double Array");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++)
				{
					b[i][j] = scanner.nextDouble();
				}
			}
			return b;
		}
		public static String[][] arrayBoolean(int m, int n)
		{
			String c[][] = new String[m][n];
			System.out.println();
			System.out.println("Boolean Array");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++)
				{
					c[i][j] = scanner.nextLine();
				}
			}
			return c;
		}	
		
		
		
		
		
/*************************10. Sum of three Integer adds to ZERO ************************************/
			
			
			/**
			 * @param arr   user give  Array element
			 */
			public  void Issumofthree(int arr[])
			{
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						for(int k=j+1;k<arr.length;k++)
						{
							if(arr[i]+arr[j]+arr[k]==0)
							{
								System.out.println(arr[i] +" + "+arr[j]+" + "+arr[k]+" = 0");
							}
						}
					}
				}
			}
			
			
/*************************11. Euclidean*************************************/
			
			/**
			 * @param first   User give First Integer input
			 * @param second  User give Second Integer input
			 * @return        final output
			 */   
			public int isEuclidean(int first,int second)
			{
				
				int  distance=(int) Math.sqrt(first*first+second*second);
						
						
				return distance;
			}
			
			
			
/*************************12. Permutation***************************************/			
			
			/**
			 * @param input       User Give String input
			 * @param first       User Give starting input 
			 * @param last        User Give length of String
			 */
			public void permutation(String input, int first, int last)
			{

				if (first == last)
				{
					System.out.print(" " + input);
				}
				else {
					for (int i = first; i <= last; i++)
					{
						input = swap(input, first, i);
						permutation(input, first + 1, last);
						input = swap(input, first, i);

					}
				}

			}

			public String swap(String str, int first, int last) 
			{
				char tmp;
				char[] arr = str.toCharArray();
				tmp = arr[first];
				arr[first] = arr[last];
				arr[last] = tmp;

				return String.valueOf(arr);
			}
			
			
			
				
/*************************13. Simulate Stop watch Program*************************************/		
			
		
			/**
			 * @param start   User give Starting time
			 * @param stop    User give Stoping time
			 * @return        Final output
			 
			 */
			public int StopWatch(int start,int stop)
			{
				long starttime = 0;
				long stoptime = 0;
				if(start>0)
				{
				 starttime=System.currentTimeMillis();
				}
				
				if(stop>0)
				{
					stoptime=System.currentTimeMillis();
				}
			
				int result=(int) (stoptime-starttime/1000);
			
				return  result;
			}
			
/**************************14.Cross Game or Tic-Tac-Toe Game ***********************************/	
			
			
			
			
			
			
/**************************15. quadratic Equation***********************************/	
			/**
			 * @param b       User give First Integer input
			 * @param c       User give Second Integer input
			 * @return        Final result
			 */
			public double[]  isquadratic(int b,int c)
			{
				double discriminant = b*b - 4.0*c;
		        double sqrt =  Math.sqrt(discriminant);

		        double root1 = (-b + sqrt) / 2.0;
		        double root2 = (-b - sqrt) / 2.0;
		        
		       
		        
		         return new double[] {root1,root2};
			}			
			
/*************************16. WindChill*************************************/
			
			  /**
			 * @param t           user give Temperature in Double
			 * @param v           user give Speed in Double
			 * @return            Final output
			 */
			   public double 	WindChill(double t, double v)
				{
				  return 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
					
				}
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
/*--------------------	Functional program --------------------------*/		
			   
			   
			   
			   
/**********************1. Anagram Detection *******************************/
			   
			   
			   public int isAnagram(String str1,String str2)
			   {
				   
				   char[] c1=str1.toCharArray();
				   char[] c2=str2.toCharArray();
				   
				   Arrays.sort(c1);
				   Arrays.sort(c2);
				   
				   if(Arrays.equals(c1, c2))
				   {
					   return 1;
				   }
				   return 0;
			   }
					
				
 /*************************2.  prime Range*************************************/
			   	   
			     
			     

			      /**
			    * @return    Return all prime between range
			    */
			   public  int[] PrimeRange()
			      {
			   	               boolean prime;
			   		           int a[]=new int[170];
			   		           int size=0;
			   				 for(int i=1;i<=1000;i++)
			   				 {
			   					 prime=true;
			   					
			   					   for(int j=2;j<i-1;j++)
			   					   {
			   						   if(i%j==0)
			   						   {
			   							   prime=false;
			   							   break;
			   						   }
			   					   }
			   					   if(prime==true)
			   					   {
			   					     
			   						   a[size]=i;
			   						   size++;
			   					   }
			   				 }

			   				 return a;
			   			
			      }
 /*************************3.1 prime Palindrome*************************************/
			      
			      /**
			    * @param arr    all prime number  between 1 t0 1000
			    */
			   public static void isprimepalimdrome(int arr[])
			      {
			   	   System.out.println("Prime Palimdrome number");
			   	   for(int i=0;i<arr.length;i++)
			   	   {
			   		    int sum=0;
			   		   int n=arr[i];
			   		   int tmp=n;
			   		   while(tmp!=0)
			   		   {
			   			   int r=tmp%10;
			   			   sum=sum*10+r;
			   			   tmp/=10;
			   			   
			   		   }
			   		   if(sum==n)
			   		   {
			   			   System.out.print(" "+sum);
			   		   }
			   	   }
			      }
/*************************3.2 prime Anagram*************************************/

			      /**
			    * @param arr    all prime number  between 1 t0 1000
			    */
			   /**
			    * @param arr
			    */
			   public static void isprimeanagarm(int arr[])
			      {
			   	    for(int i=0;i<arr.length;i++)
			   	    {
			   	    	for(int j=i+1;j<arr.length;j++)
			   	    	{
			   	    		String str1=Integer.toString(arr[i]);
			   	    		String str2=Integer.toString(arr[j]);
			   	    	   
			   	    		char[]c1=str1.toCharArray();
			   	    		char[]c2=str2.toCharArray();
			   	    		Arrays.sort(c1);
			   	    		Arrays.sort(c2);
			   	    		if(Arrays.equals(c1,c2))	    			
			   	    		{
			   	    			System.out.println(str1 +" "+ str2);
			   	    		}
			   	    	}
			   	    }
			      }
			   
			   
 /*************************4. Sort menu Driven*************************************/	
				
				
				
				
				//Take 1D Array Input
					public int[] input1DArray(int arraySize)
					{
						int array[]=new int[arraySize];
						for(int i=0;i<arraySize;i++)
						{
							System.out.println("Enter array["+i+"] : ");
							array[i]=scanner.nextInt();
						}
						return array;
					}

					//Take 1D String Array Input
					public String[] input1DStringArray(int arraySize){
						String array[]=new String[arraySize];
						for(int i=0;i<arraySize;i++){
							System.out.println("Enter array["+i+"] : ");
							array[i]=scanner.nextLine();
						}
						return array;
					}

					//Print 1D array
					public void print1DArray(int array[])
					{
						for(int i=0;i<array.length;i++)
							System.out.print(array[i]+" ");
						System.out.println();
					}
					
					//print 1D array String
					public void print1DStringArray(String array[])
					{
						for(int i=0;i<array.length;i++)
							System.out.print(array[i]+" ");
						System.out.println();
					}

				 
					//Insertion sort
					public int[] insertionSort(int words[])
					{
						int temp;
						for(int i=1;i<words.length;i++)
						{
							for(int j=i;j>0;j--){
								if((words[j]-words[j-1])<0)
								{
									temp=words[j];
									words[j]=words[j-1];
									words[j-1]=temp;
								}
								else
									break;
							}
						}
						return words;
					}
					
					//Insertion sort for String
					public String[] insertionSortString(String words[])
					{
						String temp;
						for(int i=1;i<words.length;i++){
							for(int j=i;j>0;j--){
								if(words[j].compareTo(words[j-1])<0)
								{
									temp=words[j];
									words[j]=words[j-1];
									words[j-1]=temp;
								}
								else
									break;
							}
						}
						return words;
					}
				
				
					//Bubble Sort for Integer
					public int[] bubbleSort(int numbers[])
				   	 {
				        int temp;
				        for(int i = 0; i < numbers.length; i++)
				       	{
				            for(int j = 1; j < (numbers.length -i); j++)
				            {
				            	//if numbers[j-1] > numbers[j], swap the elements
				        		if(numbers[j-1] > numbers[j])
				    			{
				    				temp = numbers[j-1];
				   					numbers[j-1]=numbers[j];
				    				numbers[j]=temp;
				    			}
				   		 	}
				    	}
						return numbers;
					}

					//Bubble Sort for String
					public String[] bubbleSortString(String numbers[])
				   	 {
				        String temp;
				        for(int i = 0; i < numbers.length; i++)
				       	{
				            for(int j = 1; j < (numbers.length -i); j++)
				            {
				            	//if numbers[j-1] > numbers[j], swap the elements
				        		if(numbers[j-1].compareTo(numbers[j])<0)
				    			{
				    				temp = numbers[j-1];
				   					numbers[j-1]=numbers[j];
				    				numbers[j]=temp;
				    			}
				   		 	}
				    	}
						return numbers;
					}
				
					//Binary Search
					public int binarySearch(int[] inputArr, int key) 
					{
				        int start = 0;
				        int end = inputArr.length - 1;
				        while (start <= end) {
				            int mid = (start + end) / 2;
				            if (key == inputArr[mid]) 
				            {
				                return mid;
				            }
				            if (key < inputArr[mid])
				            {
				               	end = mid - 1;
				            } else 
				            {
				               	start = mid + 1;
				            }
				        }
				        return -1;
				   	 }

					/************************* Binary Search String*************************************/		
				      
					
					/**
					 * @param arr    User give  array in Integer element
					 * @param search Which String  user want Enter here
					 * @return       return String  present or not
					 */
					public int binarySearchString(String arr[],String search)
					{
						
						int first = 0, last = arr.length - 1;
					
				        while (first <= last)
				        { 
				       	 int m = (first +last) / 2; 
				  
				            int res = search.compareTo(arr[m]); 
				  
				       
				            if (res == 0) 
				                return m; 
				  
				            if (res > 0) 
				            	first = m + 1; 
				  
				     
				            else
				            	last = m - 1; 
				        } 
				  
				        return -1; 
						
					}
/*************************5. find your number *************************************/		
				      
	public int findyournumber(int low, int high) 
	{

		int mid;
		while (low != high)
		{
			mid = (low + high) / 2;
			System.out.println("Enter 1 no is between" + low + " - " + mid + "\nEnter 2 if no is between" + (mid + 1)
					+ " - " + high);
			int c = scanner.nextInt();
			mid = (low + high) / 2;
			if (c == 1) 
			{
				high = mid;
			} else
			{
				low = mid + 1;
			}
		}

		return low;
	}

 /*************************6. Binary Search the Word from Word List*************************************/		
			      

/**
 * @param arr    User give  array in Integer element
 * @param search Which String  user want Enter here
 * @return       return String  present or not
 */
public int WordList(String search)throws Exception
{
	
	FileReader fr = new FileReader("/home/bridgeit/file.txt");
	int data;
	String str = "";
	while ((data = fr.read()) != -1) 
	{
		str += (char) data;
	}

	String arr[] = str.split(" ");
	
    return binarySearchString(arr, search);
    
    
    
}

/************************* 7.Insertion sort String*************************************/	
				/**
				 * @param arr   User give  array in String element
				 * @return      return final output in  sorted  String Array 
				 */
				public String[] InsertionSortIString(String arr[])
				{
					  int i,j;
					  String min;
					  int len=arr.length;
					  for( i=0;i<len;i++)
					  {
						  min=arr[i];
						  for(j=0;j<len;j++)
						  {
							  if(arr[i].compareTo(arr[j])>0) 
							  {break;
							  }
							  arr[j+1]=arr[j];
						  }
						  arr[j+1]=min;
					  }
					
					return arr;
				}
/*************************8. Bubble Sort Integer*************************************/				
				/**
				 * @param arr   User give  array in Integer element
				 * @return      return final output in  sorted  Integer Array 
				 */
				public int [] BubbleSortInt(int arr[])
				{
					
					int n=arr.length;
					for(int i=0;i<n-1;i++)
					{
						for(int j=0;j<n-i-1;j++)
						{
							if(arr[j]>arr[j+1])
							{
								int tmp=arr[j];
								arr[j]=arr[j+1];
								arr[j+1]=tmp;
							}
						}
					}
					return arr;
				}
 			

/*************************9. Merge Sort *************************************/
				
				public void mergesort(int array[],int lower,int higher)
				{
					int low = lower;
					  int high = higher;
					  if (low >= high)
					  {
					      return;
					  }

					  int middle = (low + high) / 2;
					  
					  
					  mergesort(array, low, middle);
					  
					  mergesort(array, middle + 1, high);
					  
					  int end_low = middle;
					  int start_high = middle + 1;
					  
					  while ((lower <= end_low) && (start_high <= high))
					  {
					    if (array[low] < array[start_high]) 
					    {
					       low++;
					    }
					    else 
					    {
					      int Temp = array[start_high];
					      for (int k = start_high- 1; k >= low; k--)
					       {
					         array[k+1] = array[k];
					       }
					 
					      
					   array[low] = Temp;
					  low++;
					  end_low++;
					  start_high++;
					  }
					  }
					   
					
					
				
				
				
}			
				
 /**************************10 vending machine ***********************************/	
				
				
				static int ii,total;
				static int notes[]= {2000,1000,500,200,100,50,20,10,5,2,1};
				
				/**
				 * @param value  User give Amount    
				 */
				public static void vendingmachine(int amount)
				{
					if(amount/notes[ii]!=0)
					{
						total+=(amount/notes[ii]);
						System.out.println(notes[ii]+ "rs notes :" +amount/notes[ii]);
						amount=amount%notes[ii];
					}
					ii++;
					if(amount==0)
					{
						System.out.println("total Notes "+total);
						return;
					}
					vendingmachine(amount);
					
				}
				
				
/**************************11.DayOfWeek ***********************************/	
				
				
				/**
				 * @param d       User give Day
				 * @param m       User give Month
				 * @param y       User give  Year
				 * @return        return final output current day
				 */
				public int dayofweek(int d,int m,int y)
				{
					int y1=y-(14-m)/12;
					int x=y1+y1/4-y1/100+y1/400;
					int m1=m+12*((14-m)/12)-2;
					int d1=(d+x+31*m1/12)%7;

					
					return d1;
				}
				
				
/*************************12. temperature Conversion *************************************/
				
				  public double  CelsiustoFahrenheit(Double f)
				  {
					  return  f * (9 / 5) + 32;
				  }
				  public double  FahrenheittoCelsius(Double c)
				  {
					  return ((c - 32)*5)/9;
				  }
			
/*************************13. monthly Payment***************************************/
					
					
					public  double monthlyPayment(double p, double y, double r)
					{
						double n = 12 * y;
						double r0 = r / (12 * 100);
						double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
						return payment;
					}
					
			
/*************************14. square root of a nonnegative number ***************************************/	
					
				public double sqrtWithNewton(Double c)
				{
					
					double epsilon = 1.0e-15;  
			        double t = c; 			        
			        while (Math.abs(t - c/t) > epsilon*t) 
			        {
			            t = (c/t + t) / 2.0;
			        }

			        
			        return t;

				}
				
		
/*************************16.  Binary using toBinary ***************************************/					
				
		        /************** Decimal to Binary ***************************/		
						/**
						 * Function to convert decimal to binary
						 *
						 * @param d integer value to convert
						 * @return return integer array with binary digits
						 */
					public	 int[] toBinary(int d) 
					{

							String bin = "";
							while (d != 0) 
							{
								bin = (d % 2) + bin;
								d /= 2;
							}
							while (bin.length() % 4 != 0) 
							{
								bin = 0 + bin;
							}
							return stringToIntArray(bin);
												
						}
					
		         /*********************Binary to Decimal*****************************/
					/**
					 * Function to convert binary to decimal
					 *
					 * @param binary the binary array to cenvert
					 * @return return converted decimal no
					 */
					public	 int toDecimal(int[] binary) {
						int dec = 0, j = 0;
						for (int i = binary.length - 1; i >= 0; i--) {
							if (binary[i] == 1) {
								dec = dec + (int) Math.pow(2, j);
							}
							j++;
						}
						return dec;
					}
		           /********************** powerOf2 ******************************/		
					/**
					 * @param n
					 * @return
					 */
					public	static boolean powerOf2(int n) 
					{
						// calculate power of 2 using math.pow
						// check if is equal to given no
						// stops if pow is greater than given number
						int i = 0, temp = (int) Math.pow(2, i);
						while (temp < n) 
						{
							if (temp == n) 
							{
								return true;
							}
							i++;
						}
						return false;
					}		
					
					
					/**
					 * Function to swap nibbles in array
					 *
					 * @param int array to swap nibbles in array
					 * @return return swapped array
					 */
					
		         /********************** swapNibbles *****************************/	
					
					
					public static int[] swapNibbles(int[] arr) {
						
						// swap nibbles at first and last of the array
						// j is used for saving last 4 index of the array
						int temp, j = arr.length - 4;
						for (int i = 0; i < 4; i++) 
						{ // loop runs 4 times and swap first four element to last four elements
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
							j++;
						}
						return arr;
					}	
					
					
			
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					


/************************* Quick sort Integer*************************************/	
	
				
				
				public int[]  QuickSort(int arr[],int first,int last)
				{
					
					int i,j,pivot,tmp;
					if(first<last)
					{
						
						pivot=first;
						i=first;
						j=last;
						while(i<j)
						{
							while(arr[i]<=arr[pivot] && i<last)
							{i++;}
							while(arr[j]>arr[pivot])
							{j--;}
							if(i<j)
							{
								tmp=arr[i];
								arr[i]=arr[j];
								arr[j]=tmp;
							}
						}
						tmp=arr[pivot];
						arr[pivot]=arr[j];
						arr[j]=tmp;
						QuickSort(arr,first,j-1);
						QuickSort(arr, j+1, last);
						
						
						
					}
					
					return arr;
				}
				

			
			
				/**
				 * Function to convert string to int array helper function for swapnibble in
				 * Binary.java class
				 *
				 * @param bin String of binary no
				 * @return return integer array
				 */
				public static int[] stringToIntArray(String bin) {
					int[] binary = new int[bin.length()];
					for (int i = 0; i < binary.length; i++) {
						binary[i] = bin.charAt(i) - 48;
					}
					System.out.println(binary);
					return binary;
					
					
				}
				
				
				
				
				
				
				
				
				/**
				 * Function to check if no is power of 2
				 *
				 * @param number to check the for power of 2
				 * @return boolean for prime no
				 */
				
				
				
		
	/*************************Prime***************************************/
	
	/**
	 * @param number   User give first number
	 * @return         Final output  for user Integer
	 */
	

	public  int  isPrimeOrNot(int number)
	{
		int prime=0;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				return prime=1;
				
			}
		}
		return prime;
	}
	
	
	
	
	
	
	/************************* Bubble Sort String*************************************/	
	/**
	 * @param arr   User give  array in String element
	 * @return      return final output in  sorted  String Array 
	 */
	public String[] BubbleSortString(String arr[])
	{
		
		int i,j;
	   String tmp;
	   for(i=0;i<arr.length;i++)
	   {
		   for( j=0;j<arr.length;j++)
		   {
			   if(arr[j].compareTo(arr[j+1])>0)
			   {
				   tmp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=tmp;
			   }
		   }
	   }
	   return arr;
		
	}
	
	

	
	
	
	/*************************Palimdrome*************************************/
	
	/**
	 * @param input   User give Integer Input
	 * @return        Final output
	 */
	public  int  isPalimdrome(String input)
	{
		
		
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(input.length()-i-1))
				{
					 return 1;
				}
			}
		}
		return 0;
		
		
		
	}

	

	
	
		
		
 
	
	
	

   




	
	
	



	public int  ispalimdrome(int number)
	{
		
	     int tmp=number,sum=0;
	     while(tmp!=0)
	     {
	    	 int r=tmp%10;
	    	 sum=sum*10+r;
	    	 tmp/=10;
	     }
	     if(sum==number)
	     {
	    	 return 1;
	     }
     return 0;
			
	}
	public int  isprime(int number)
	{
		 int flag=0;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
			  flag=1;	
			  break;
			}
		}
		if(flag==0)
		{
			return 1;
		}
		
     return 0;
			
	}
	
	
	public ArrayList israngeprime(int first,int last)
	{
		ArrayList al=new ArrayList();
		int prime=0;
		for(int i=first;i<last;i++)
		{
			prime=1;
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					prime=0;
					break;
				}
			}
			if(prime==1)
			{
				al.add(i);
			}
		}
		return al;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
