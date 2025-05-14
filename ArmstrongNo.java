package in.sp.backend;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * double x = Math.pow(2, 4); System.out.println(x);
		 */
		
		int no = 151 ;
		int temp = no;
		double sum = 0;
		while(temp != 0)
		{
			int d = temp %10;  //3 5 1
			 sum = sum + Math.pow(d,3); // 0 + 1 + 125 + 1
			 temp = temp /10; //15
			
		}
		
		System.out.println(sum);
		
		if(no == sum)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not a armstrongno");
		}
	}

}
