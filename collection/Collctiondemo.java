package in.sp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collctiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(55);
		l.add(2);
		l.add(null);
		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(l);
		l2.add(11);
		l2.add(12);
		l2.add(55);
		l2.add(12);
		l2.add(null);
		System.out.println(l2);
		System.out.println(l2.contains(55));
		int a[] = {1,2,3};
		
		List<Integer> l3 = new ArrayList<Integer>();
		for(int i = 0 ; i<a.length; i++)
		{
			l3.add(a[i]);
		}
		/*for(int x : l3)
		{
			System.out.println(x);
		}*/
		System.out.println(l3);
		
		for(int i = 0; i < l3.size();i++)
		{
			System.out.println(l3.get(i));
		}
		System.out.println("iterator");
		//it is a univasal cursor can
		//be used with any of the col classes
		Iterator itr = l3.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// ListIterator can be used only with list implemented classes
		// it can move both forward and backward
		//hasPrevious and hasNext()
		ListIterator litr1 = l3.listIterator(l3.size());
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		
		
	}

}
