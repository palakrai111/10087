package in.sp.backend;

import java.util.Random;

public class Randomex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int x = r.nextInt(10);
		//System.out.println(x);
		int a[] = new int[5];
		for(int i =0 ; i<a.length;i++)
		{
			a[i] = r.nextInt(10);
		}
		System.out.println("array elemnt");
        for(int y : a)
        {
        	System.out.println(y);
        }
	}

}
