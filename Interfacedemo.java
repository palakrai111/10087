package in.sp.backend;

public class Interfacedemo implements Showable, Printablle
{
	
	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("i am priting");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacedemo ob = new Interfacedemo();
		ob.print();
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" i am inside show");
		
	}

	

}
