package in.sp.multithreadingexample;

public class tablemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printtable ob = new Printtable();
		ThreadP1 t1 = new ThreadP1(ob);
		t1.start();
		ThreadP2 t2 = new ThreadP2(ob);
	     t2.start();
		

	}

}
