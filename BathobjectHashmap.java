import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BathobjectHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentinfo ob1 = new Studentinfo(1,"ram");
		Studentinfo ob2 = new Studentinfo(2,"shyam");
		Studentinfo ob3 = new Studentinfo(3,"mohan");
		Studentinfo ob4 = new Studentinfo(4,"xyz");
		
		HashMap<Integer,Studentinfo> hm = new HashMap<Integer,Studentinfo>();
		
		hm.put(1, ob1);
		hm.put(2, ob2);
		hm.put(3, ob3);
		hm.put(4, ob4);
		
	/*	for(Map.Entry<Integer,Studentinfo> me : hm.entrySet())
		{
			System.out.println(me.getKey() + " " +me.getValue().getId()+ " "+ me.getValue().getName());
		}*/
		
		
		Set<Integer> sv = hm.keySet();
		for(int ob : sv)
		{
			System.out.println(hm.get(ob).getName()+hm.get(ob).getId() + " ");
		}
		

	}

}
