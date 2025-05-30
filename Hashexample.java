import java.util.*;
public class Hashexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Bokdemo> hs = new HashSet<Bokdemo>();
		Bokdemo ob1 = new Bokdemo(1,"abc"); //3
		Bokdemo ob2 = new Bokdemo(1,"abc"); //3
		Bokdemo ob3 = new Bokdemo(2,"xyz");
		hs.add(ob1);
		hs.add(ob2);
		hs.add(ob3);
		
		for(Bokdemo ob : hs)
		{
			System.out.println(ob.getId() + " " + ob.getName());
		}
		

	}

}
