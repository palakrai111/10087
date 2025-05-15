package in.sp.backend;

public class Mobile {
     int id;
     String name;
     int version;
     Mobile(int id, String name)
     {
    	 this.id = id;
    	 this.name = name;
     }
     Mobile(int id, String name,int version)
     {
    	this(id,name);
    	 this.version = version;
     }
	void display()
	{
		System.out.println(id + " "+ name + " "+ version);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ob = new Mobile(1,"iphone",101);
		ob.display();
	}

}
