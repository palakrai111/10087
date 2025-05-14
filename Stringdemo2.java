package in.sp.backend;

public class Stringdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "I am palak rai";
		int charcount = 0;
		int spacecount = 0;
		for(int i = 0; i <x.length();i++)
		{
			char c = x.charAt(i);
			if(c != ' ')
			{
				charcount++;
			}
			else
			{
				spacecount++;
			}
			
		}

		System.out.println("ccount :" +charcount );
		System.out.println("scount :" +spacecount );
		
	}

}
