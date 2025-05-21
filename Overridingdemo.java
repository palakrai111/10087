package in.sp.backend;
class Vehicle
{
	void run()
	{
	   System.out.println("vehicle is running");	
	}
}
class Bike extends Vehicle
{
	void run()
	{
		//super.run();
	   System.out.println("Bike is running");	
	}

}
class Cycle extends Vehicle
{
	void run()
	{
		//super.run();
	   System.out.println("cycle is running");	
	}

}

public class Overridingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Bike b = new Bike(); b.run(); Cycle c = new Cycle(); c.run();
		 */
        Vehicle v;
        v = new Bike();
        v.run();
        
        v = new Cycle();
        v.run();
	}

}
