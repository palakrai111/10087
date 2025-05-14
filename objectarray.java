package in.sp.backend;

public class objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String s2 = "abc";
		s2 =s2.concat("annmm");
		System.out.println(s2.hashCode());
		System.out.println();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		String s1 = new String("abc");
		if(s.equals(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
