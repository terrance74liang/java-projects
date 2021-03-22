import java.util.Scanner;
public class work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix size seperated by a comma(rows x columns): ");
		String matrix_size = input.nextLine();
		
		int matrix_rows = Integer.parseInt(matrix_size.substring(0,matrix_size.indexOf(',')));
		int matrix_columns = Integer.parseInt(matrix_size.substring(matrix_size.indexOf(',')+1));
		int [][]matrix = new int[matrix_rows][matrix_columns];
		int [][]matrix_transpose = new int[matrix_columns][matrix_rows];
		
		System.out.println("");
		System.out.println("Please enter...");
		System.out.println("");
		
		for (int i=0;i<matrix.length;i++)
		{
			for (int j=0;j<matrix[matrix_rows-1].length;j++)//-1 inside because what is inside bracket is index
			{
				
				System.out.print("matrix element "+(i+1)+","+(j+1)+": ");
				matrix[i][j]=input.nextInt();
			}
		}
		System.out.println("");
		System.out.println("The matrix you have just entered is: ");
		for (int i=0;i<matrix.length;i++)
		{
			
			for (int j=0;j<matrix[matrix_rows-1].length;j++)
			{
				System.out.print("     "+matrix[i][j]);
				
				
			}
			System.out.println("");
		}
		
		System.out.println("The matrix Transpose is: ");	
		
		for (int i=0;i<matrix[matrix_rows-1].length ;i++)//make sure limits are set to new matrix
		{
			for (int j=0;j<matrix.length ;j++)
			{
				matrix_transpose[i][j]=matrix[j][i];
				System.out.print("     "+matrix_transpose[i][j]);
				
			}
			System.out.println("");
		}
		

	}

}
