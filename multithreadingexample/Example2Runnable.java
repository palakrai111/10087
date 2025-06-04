package in.sp.multithreadingexample;

public class Example2Runnable implements Runnable 
{
	@Override
	public void run() 
	{
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Example2Runnable t1 = new Example2Runnable();
		Thread th1 = new Thread(t1);
		th1.start();
		
		
		Example2Runnable t2 = new Example2Runnable();
		Thread th2 = new Thread(t2);
		th2.start();

	}

	

}
