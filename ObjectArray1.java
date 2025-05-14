package in.sp.backend;

import java.util.*;
public class ObjectArray1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Animal ob[] = new Animal[3];
		
		for(int i =0; i < 3; i++)
		{
			System.out.println("enetr name");
			String name = sc.next();
			System.out.println("enetr age");
			int age = sc.nextInt();
			
			ob[i] = new Animal();
			ob[i].setAge(age);
			ob[i].setName(name);
			
		}

		for(Animal a : ob)
		{
			System.out.println(a);
		}
	}

}
