import java.util.*;
public class Prac9 {
	public static void main(String[] args) 
	{
		int i,j=0;
		Scanner yash = new Scanner(System.in);
		System.out.println("Enter number rows for 2D array: ");
		int a=yash.nextInt();
		System.out.println("Enter number columns for 2D array: ");
		int b=yash.nextInt();
		
		int array1[][]=new int[a][b];
		int array2[][]=new int[a][b];
		int sum[][]=new int[a][b];

		System.out.println("Input elements of matrix 1: -");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array1[i][j]=yash.nextInt();
			}
		}

		System.out.println("Input elements of matrix 2: -");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array2[i][j]=yash.nextInt();
			}
		}

		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				sum[i][j]=array1[i][j]+array2[i][j];
			}
		}

		System.out.println("----| OUTPUT |----");
		System.out.println("Sum of the matrices: -");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.println(sum[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}