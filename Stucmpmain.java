package in.sp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Stucmpmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuComparable ob1 = new StuComparable(103,"palak");
		StuComparable ob2 = new StuComparable(102,"nayan");
		StuComparable ob3 = new StuComparable(101,"priya");
		ArrayList<StuComparable> al = new ArrayList<StuComparable>();
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		Collections.sort(al);
		for(StuComparable x : al)
		{
			System.out.println(x.id + " " + x.name);
		}
		

	}

}
