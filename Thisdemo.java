package in.sp.backend;

public class Thisdemo {
	
	void first()
	{
		System.out.println("inside first");
	}
	void second()
	{
		this.first();
		System.out.println("inside second");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thisdemo  ob = new Thisdemo();
		//ob.first();
		ob.second();
	}

}
