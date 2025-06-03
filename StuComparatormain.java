package in.sp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class StuComparatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StuComparator ob1 = new StuComparator(180,"a");
		StuComparator ob2 = new StuComparator(170,"b");
		StuComparator ob3 = new StuComparator(190,"c");

		ArrayList<StuComparator> al = new ArrayList<StuComparator>();
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		Collections.sort(al,new IdComparator());
		for(StuComparator  x: al)
		{
		System.out.println(x.id + " " + x.name);	
		}

	}

}
