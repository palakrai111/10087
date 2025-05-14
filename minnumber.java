package in.sp.backend;

import java.util.Arrays;

public class minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,190,65,35,80};
		int max = a[0];
		int min = a[0];
		for(int i = 0; i < a.length;i++)
		{
			if(a[i]> max)
			{
				max = a[i]; //13//90
				
				
			
			}
			if(a[i] < min){
				min = a[i];  
			}
			
		}

		System.out.println(min);
		System.out.println(max);
		
		Arrays.sort(a);
		
		System.out.println("min :" + a[0]);
		System.out.println("max :" + a[a.length-1]);
	}

}
