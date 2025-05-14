package in.sp.backend;

import java.util.*;

public class Array2deample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				a[i][j]=sc.nextInt();
			}
			
			
		}
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
			 System.out.print(a[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++)
		{
			int colsum = 0;
			//int rowsum = 0;
			for(int j = 0; j < 3; j++)
			{
			 //rowsum = rowsum + a[i][j]; 
				colsum = colsum + a[j][i];
			}
			//System.out.println(rowsum);
			System.out.println(colsum);
			
		}
		
	}

}
