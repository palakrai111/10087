package in.sp.backend;

public class EXcepdemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");

		try {
		int i = 10;
		int j = 0;
		/*
		 * int a[] = new int[3]; a[3]=i/j;
		 */
		
		
		System.out.println("done");
		}catch(ArithmeticException ao)
		{
			System.out.println(ao.getMessage());
		}
		finally
		{
			System.out.println(" i am always executed");
		}


	}

}
