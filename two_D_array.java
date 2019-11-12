package funcational_program;
import java.util.*;
import java.io.PrintWriter;
public class two_D_array 
{

	public static void main(String[] args)
	{
		utility u=new utility();
		System.out.println("Enter the row");
		int row=u.ReadInteger();
		
		System.out.println("Enter the Column");
		int column=u.ReadInteger();
		
		
		 int[][] a =u. arrayInt(row, column);
		double[][] b =u. arrayDouble(row, column);
		String[][] c =u. arrayBoolean(row, column);
		
		PrintWriter pw = new PrintWriter(System.out,true);

		
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < column; j++)
			{
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}

	
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < column; j++)
			{
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
		
	}

}
