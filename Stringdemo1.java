package in.sp.backend;

public class Stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i am palak";
		int scount = 0;
		int charcount =0;
		for(int i = 0 ; i < s.length();i++)
		{
			char c = s.charAt(i);
			if(c != ' ')
			{
				scount++;
			}else
			{
				charcount++;
			}
		}

		
		System.out.println(scount);
		System.out.println(charcount);
	}

}
//scount,charcunt,wordcount,
//uuper to lower and lower to upper
//insert,delete,rev ,replace