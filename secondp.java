package in.sp.backend;

public class secondp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev = 0;
		int temp = 0;
		int no = 163;
		temp = no;
		int sum = 0;
		int count = 0;
		double ano = 0;
		while(temp != 0)
		{
			int d= temp%10;
			rev =rev * 10+ d;
			sum = sum + d;
			count = count +1;
			temp = temp/10;
			ano = ano + Math.pow(d,3);
			
		}
        System.out.println("sum is :" + sum);
        System.out.println("count is :" + count);
        System.out.println("ano");
        
        if(ano == no )
        {
        	System.out.println("arm");
        }
        else
        {
        	System.out.println("not arm");
        	
        }
		if(no == rev)
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("not done");
		}
	}

}
