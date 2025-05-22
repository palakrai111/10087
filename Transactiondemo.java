package in.sp.backend;

public class Transactiondemo {
	
	int amt = 1000;
	void withdraw(int wa) throws InsufficeientBalcException
	{
		if(amt < wa)
		{
			//System.out.println("insufficent balc exception");
			throw new InsufficeientBalcException("insufficient balc");
			
		}
		else
		{
		amt = amt -wa;
		}
	}
    void deposit(int da)
    {
    	amt = amt + da;
    }
	void checkBalance()
	{
		System.out.println("amt left is :"+amt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transactiondemo ob = new Transactiondemo();
		//ob.deposit(1000);  // 2000
		try {
		ob.withdraw(1500);//
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		ob.deposit(1000);
		ob.checkBalance();
	}

}
