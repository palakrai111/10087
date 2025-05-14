package in.sp.backend;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 1231;
		int rev = 0;
		int temp = 0;
		temp = no;
		int sum = 0;
		int count = 0;
		while( temp != 0)
		{
			
			int d =temp%10;    // 1//5 //1
			rev = rev * 10 + d;  //0*10+1 //1/ 1*10+5 = 15*10+1//151
			temp = temp/10;
			sum = sum + d;
			count = count+1;
		}
		System.out.println("sum o digits is:" + sum);
		
		System.out.println("count of digits is:" + count);
      if(rev == no)
      {
    	  System.out.println("palindrome");
      }
      else
      {
    	  System.out.println("not palindrome");
      }
	}

}
