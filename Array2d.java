package in.sp.backend;
import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		for(int i = 0; i<3;i++)
		{
			int colsum = 0;
			for(int j = 0; j<3;j++)
			{
				colsum = colsum + a[j][i];
				
			}
			System.out.println(colsum);
		}
		

	}

}
//matrix,digonal sum,rowsum,colsum,object arary