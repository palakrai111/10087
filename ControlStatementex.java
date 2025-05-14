package in.sp.backend;

import java.util.*;

public class ControlStatementex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// System.out.println("enter age"); int age
		/*
		 * = sc.nextInt(); System.out.println("enter weight"); int weight =
		 * sc.nextInt(); if(age > 18 && weight > 60) { System.out.println("eligible"); }
		 * else { System.out.println("not eligible");
		 * 
		 * }
		 */
		int no = 25;

		if (no % 5 == 0 && no % 3 == 0) {
			System.out.println("divisible");
		} else {
			System.out.println("not divisible");
		}

		// String color = "black";

		// color == red
		/*
		 * if(color.equals("red")) { System.out.println("i am inside red"); } else
		 * if(color.equals("yellow")) { System.out.println("i am inside yellow"); } else
		 * if(color.equals("greed")) { System.out.println("i am inside green"); } else {
		 * System.out.println("color is not present"); }
		 */

		int choice = 1;
		// boolean b = true;

		switch (choice) {
		case 1:
			System.out.println("i am inside case 1");
			break;
		case 2:
			System.out.println("i am inside case 2");
			break;
		default:
			System.out.println("i am inside default");

		}

		System.out.println("enter your choice +,-");
		char c = sc.next().charAt(0);  // 123eertkkk
		//
		//sc.next
		int a = 9;
		int b = 8;
		switch(c)
		{
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		default:
			System.out.println("i am inside default");
		}
		
		
		/*
		 * for(int i =0; i <=10;i++) { if(i == 5) { continue; } System.out.println(i); }
		 */
		
		
		
		for(int i = 0; i <3;i++)
		{
			for(int j = 0; j <3;j++)
			{
				if(i == 1 && j==1)
				{
					continue;
				}
				System.out.println(i + " " + j);
			}
			int evensum = 0;
			int oddsum = 0;
			for(int j= 0 ; j <=10; j++)
			{
				 if(j%2 == 0)
				 {
					 evensum += j;
				 }
				 else
				 {
					 oddsum += j;
				 }
			}
			
			System.out.println(evensum);
			System.out.println(oddsum);
		}

	}

}
