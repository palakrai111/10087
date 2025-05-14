package in.sp.backend;

public class FirstProgram1 {
	/*
	 * static void first() { System.out.println("abc"); } static void second() {
	 * System.out.println("abc"); }
	 */
	static String clg = "abc";
	 
	  void m1(int x)
	  {
		  x = x+ 10;
		  System.out.println(x);
	  }
	  void m2(int x)
	  {
		  x = x+ 20;
		  System.out.println(x);
	  }
	
	static public void main(String[] args) {
		
		
		System.out.println("hello world");
		/*
		 * first(); second();
		 */
		
		FirstProgram1 ob = new FirstProgram1();
		ob.m1(10);
		ob.m2(50);
		System.out.println(ob.clg);
		
		FirstProgram1 ob2 = new FirstProgram1();
		ob.m1(10);
		ob.m2(50);
		System.out.println(ob2.clg);
	}

}
