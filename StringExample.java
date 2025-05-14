package in.sp.backend;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		//char c1[] = s.toCharArray();
		String s2 = "abc";
		//char c2[] = s2.toCharArray();
		int i =s.compareTo(s2);
		System.out.println(i);
	    // s=s2 -> 0
		// s>s2 -> +
		//s<s2 -> -
		
		
		String x = "MY name is palak";
		String s1[] = x.split(" ");// {my, name,is, palak}
		String ch1 = s1[0].toLowerCase();
		String ch2 = s1[1].toUpperCase();
		String ch3 = s1[3].replace("a","*");
		System.out.println(ch1+" "+ ch2 + " "+ ch3);
		
		System.out.println("program on substring");
		
		String x1="palak";
		String y1 = x1.substring(1,5);
		System.out.println(y1);
		char r = x1.charAt(0);
		String z = y1+r;
		System.out.println(z);
		
		

	}

}
