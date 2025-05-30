import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		HashMap<Integer,Books> hm2 = new HashMap<Integer,Books>();
		Books b1 = new Books(1,"mahabharat");
		Books b2 = new Books(2,"geeta");
		Books b3 = new Books(3,"ramayan");
		hm2.put(1, b1);
		hm2.put(2, b2);
		hm2.put(3 , b3);
		System.out.println(hm2);
		
		
		
		Set<Integer> s = hm2.keySet();
		for(int x: s) 
		{
			System.out.println(hm2.get(x).getId() + " " +hm2.get(x).getName());
		}
		
	/*	hm.put(1,"abc");
		hm.put(2,"xyz");
		hm.put(3,"def");
		
		//System.out.println(hm);
		
		for(Map.Entry<Integer,String> me: hm.entrySet())
		{
			System.out.println(me.getValue() + " "+me.getKey());
		}
          System.out.println("using keyset");
		
		   Set<Integer> s = hm.keySet();  //[1,2,3]
		for(int x: s)
		{
			System.out.println( x + " " + hm.get(x));
		}*/
		
	}

}
