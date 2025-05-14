package in.sp.backend;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringdemo ob = new Stringdemo();
		System.out.println(ob.hashCode());
		String s1 = "palak";  //literal
		String s2 = "palak";
		
		s2=s2.concat("xyz");
		System.out.println("updated"+s2);
		
		String s3 = new String("palak"); //new
		/*System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
*/
}
}