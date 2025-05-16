package in.sp.backend;
class Animal123
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal123
{
	void run()
	{
		System.out.println("dog is running");
	}
}
class BabyDog extends Animal123
{
	void weeping()
	{
		System.out.println("babydog is weepingBa");
	}
}

public class Inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d = new BabyDog();
		d.eat();
	//	d.run();
		d.weeping();

		Dog d1= new Dog();
		d1.run();
		d1.eat();
		
	}

}
