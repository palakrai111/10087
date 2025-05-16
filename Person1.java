package in.sp.backend;

class Person2
{
	 int x;
	Person2(int x)
	{
		System.out.println("hello");
		this.x = x;
	}

}
class Person3 extends Person2
{
	int y ;
	Person3(int x, int y)
	{ 
		super(x);
		this.y = y;
		System.out.println("hello person3");
		
	}
	
	void display()
	{
		System.out.println(x + " " + y);
	}

}
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 ob = new Person3(5,7);
		ob.display();
		
	}

}
