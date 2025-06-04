package in.sp.multithreadingexample;

public class ThreadP2 extends Thread
{
	
	Printtable p2;
	ThreadP2(Printtable p2)
	{
		this.p2 = p2;
	}
	public void run()
	{
		p2.printTable(10);
	}

}
