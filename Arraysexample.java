package in.sp.backend;
import java.util.*;
public class Arraysexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4};
		int sum = 0;
		
		for(int i = 0 ; i<a.length;i++)
		{
			//System.out.println(a[i]);
			sum = sum + a[i];
		}

		System.out.println(sum);
		
		System.out.println("elemnts of array b");
		int b[] = new int[3];
		for(int i = 0; i < b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		/*
		 * for(int i = 0; i < b.length;i++) { System.out.println(b[i]); }
		 */
		
		for(int x:b)
		{
			System.out.println(x);
		}
		
		
		if(a[0] == b[b.length -1])
		{System.out.println("equal");}
		else
		{
			System.out.println("not equal");
		}
		
		
	}

}
