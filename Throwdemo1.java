package in.sp.backend;

public class Throwdemo1 {
	
	void validateAge(int age) throws AgeNotValidException
	{
		if(age <18)
		{
			throw new AgeNotValidException("age not valid , it should be more than 18");
		}
		else
		{
			System.out.println("correct age");
		}
	}
	public static void main(String[] args) throws AgeNotValidException
	{
		// TODO Auto-generated method stub

		Throwdemo1 ob = new Throwdemo1();
	try
		{
		ob.validateAge(16);
		}catch(AgeNotValidException e)
	{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
