package in.sp.backend;

public class Employee123 {
	
	int eid;
	String name;
	int salary;
	
	Employee123(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
		System.out.println(this);
	}
	Employee123(int eid,String name,int salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(eid + " " + name+ " " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee123 ob = new Employee123(1,"palak",5000000);
		ob.display();
		System.out.println(ob);
		
		Employee123 ob2 = new Employee123(2,"abc");
		ob2.display();
	}

}
