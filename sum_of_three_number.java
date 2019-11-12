package funcational_program;

public class sum_of_three_number 
{

	public static void main(String[] args) 
	{
		  utility u=new utility();
			System.out.println("Enter the Array size");
			int size=u.ReadInteger();
			int arr[]=new int[size];
			System.out.println("Enter the  "+size+" Number array");
			for(int i=0;i<size;i++)
			{
				arr[i]=u.ReadInteger();
			}
			
			for(int i=0;i<size-1;i++)
			{
				for(int j=i+1;j<size-1;j++)
				{
					for(int k=j+1;k<size-1;k++)
					{
						if(arr[i]+arr[j]+arr[k]>0)
						{
							System.out.println(arr[i] +" + "+arr[j]+" + "+arr[k]+" = 0");
						}
					}
				}
			}
	}

}
