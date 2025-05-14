package in.sp.backend;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "peps";
		String b = "keep";
		
		if(a.length() == b.length())
		{
			
			char c1[] = a.toCharArray();
			char c2[] = b.toCharArray();
			Arrays.sort(c2); //eekp
			Arrays.sort(c1);//eekp
			
			boolean b1 = Arrays.equals(c1, c2);
			if(b1)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
		else
		{
			System.out.println("not anagram length");
		}

	}

}
