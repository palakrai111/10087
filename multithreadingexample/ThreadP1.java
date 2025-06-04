package in.sp.multithreadingexample;

public class ThreadP1 extends Thread
{
	Printtable p1;
	ThreadP1(Printtable p1)
	{
		this.p1 = p1;
	}
	public void run()
	{
		p1.printTable(5);
	}
}
