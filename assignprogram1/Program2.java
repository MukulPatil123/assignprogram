import java.util.Scanner;
class TwoD
{
	public static void main(String[]args)
	{
		//Value of row
		System.out.println("Enter row:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();

		//value of column
        System.out.println("Enter column:");
		Scanner sc1=new Scanner(System.in);
		int c=sc.nextInt();

		int mat1[][]=new arr[r][c];

		//value of first matrix
		System.out.println("Enter the values in matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Scanner sc2=new Scanner(System.in);
				mat1[r][c]=sc2.nextInt();
			}
		}

		//value of second matrix
		int mat[][]=new mat[r][c];
		System.out.println("Enter the values in matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Scanner sc3=new Scanner(System.in);
				mat2[][]=sc3.nextInt();
			}
		}

		//convert into AND operation
		int and[][]=new int[r][c];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				and[i][j]=mat1[i][j]&&mat2[i][j];
				System.out.println(and[i][j]);  
			}
			System.out.println();
		}

		//convert into OR operation
		int or[][]=new int[r][c];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				or[i][j]=and[i][j] || mat1[i][j];
				System.out.println(or[i][j]);
			}
			System.out.println();
		}

		//convert 2D array into 1D array


		

	}
}