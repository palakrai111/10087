package in.sp.backend;

public class Exceptionexample {
	
	
	
	static void calculate()
	{
		System.out.println("calculate");
		int i = 100;
		int j = 0;
		int k = i/j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calculation started");
		try {
		calculate();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("calculation ended");
		
	}

}
