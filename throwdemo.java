package in.sp.backend;

public class throwdemo {
	
	void checkAge(int age) throws Agenotvalid
	{
		if(age < 18)
		{
			throw new Agenotvalid("age not valid");
		}
		else
		{
			System.out.println("valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwdemo ob = new throwdemo();
		try
		{
		ob.checkAge(17);
		}catch(Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 * throwdemo ob= null; ob.checkAge(19);
		 */
		System.out.println("done");
	}

}
