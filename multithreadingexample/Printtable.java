package in.sp.multithreadingexample;

public class Printtable 
{
	synchronized void printTable(int n)
	{
	   for(int i =0; i <=10;i++)
	   {
		 System.out.println(i*n);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}
}
