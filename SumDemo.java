package in.sp.backend;

public class SumDemo {
	static
	{
		System.out.println("i am executed first");
	}
	
	static int calulateSum(int arry1[])
	{
		int sum = 0;
		for(int x:arry1)
		{
			sum = sum + x;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SumDemo ob = new SumDemo();
		int arry1[] = {1,2,3,4,5};
		int x= calulateSum(arry1);
		System.out.println(x);

	}

}
