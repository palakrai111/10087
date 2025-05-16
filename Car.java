package in.sp.backend;

public class Car {
	
	String name;
	String model;
	MusicPlayer mp;
	public Car(String name, String model, MusicPlayer mp) {
		super();
		this.name = name;
		this.model = model;
		this.mp = mp;
	}
 void carRunning()
 {
	 System.out.println("carstarted");
	 mp.plaYSongs();
	 System.out.println(mp.brand + " " + mp.price +" " +model + " "+name);
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlayer ob1 = new MusicPlayer("philips",1000);
		Car c = new Car("kia seltos","seltos",ob1);
		c.carRunning();

	}

}
