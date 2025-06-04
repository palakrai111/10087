package in.sp.multithreadingexample;

public class Example1 extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
			
			
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 t1 = new Example1();
		t1.setName("firstT");
		t1.setPriority(10);
		t1.start();
		//t1.run();
		
		Example1 t2 = new Example1();
		t2.setName("second");
		t2.setPriority(10);
		t2.start();
		//t2.run();
		
	}

}
