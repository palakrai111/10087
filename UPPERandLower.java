package in.sp.backend;

public class UPPERandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // upper -> 65 - 90
		// lowe -> 97- 122
		
		String z = "I am PAlaK"; //i AM paLAk
		
		for(int i = 0; i <z.length();i++)
		{
			char c = z.charAt(i);
			if(c >='A'&&c <='Z')
			{
				int x = c + 32;
				System.out.print((char)x);
			}
			else
			{
				int x = c-32;
				System.out.print((char)x);
			}
		}
	}

}
