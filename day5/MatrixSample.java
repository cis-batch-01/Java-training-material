import java.util.Scanner;

public class MatrixSample {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row and column");
		int row=Integer.parseInt(scan.nextLine());
		int column=Integer.parseInt(scan.nextLine());
		int [][] matrix1=new int[row][column];
		int [][] matrix2=new int[row][column];
		int [][] resMatrix=new int[row][column];
		for(int k=1;k<=2;k++)
		{
		System.out.println("Enter matrix "+k);
		System.out.println("Enter "+row*column+" elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(k==1)
				{
				matrix1[i][j]=Integer.parseInt(scan.nextLine());
				}else
				{
					matrix2[i][j]=Integer.parseInt(scan.nextLine());
				}
				
			}
			
		}
		}
		System.out.println("Addtion Resultant Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				resMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(i+j+" "+resMatrix[i][j]+"   ");
			}
			System.out.println();
		}
		
		
	}

}
