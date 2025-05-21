package in.sp.backend;
abstract class Shape
{
	void display()
	{
		System.out.println("i am abstract class");
	}
   abstract void draw();
}
class circle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Circle is drawing");
	}
	
}

class Rectange extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Rectangle is drawing");
	}
	
}
public class Abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.display();
		c.draw();
		Rectange r = new Rectange();
		r.display();
		r.draw();
		
	}

}
