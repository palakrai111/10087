package in.sp.backend;

class Emp
{
	String color = "black";
	void display()
	{
		System.out.println("hello");
	}

}
class programmer extends Emp
{
	String color = "white";
	void display()
	{
		super.display();
		System.out.println("child :"+color);
		System.out.println("super :"+super.color);
	}

}

public class EmployeeSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		programmer ob = new programmer();
		ob.display();

	}

}
