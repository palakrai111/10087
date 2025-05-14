package in.sp.backend;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "my NAME is palak";
		String x1[]=x.split(" ");
		String a=x1[0].toUpperCase();
		String b = x1[1].toLowerCase();
		String z = a+b;
		System.out.println(z);
		String y = "abcde";
		char l = y.charAt(0);
		String c = y.substring(1, 5);
		System.out.println(c+l);
		String newstr = "";
		for(int i = 0; i<y.length();i++)
		{
			char ch = y.charAt(i);
		newstr = newstr + ch;
		i =i+1;
		}
  System.out.println(newstr);
	}

}
