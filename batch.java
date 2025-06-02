import java.util.*;
public class batch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentinfo ob1 = new Studentinfo(1,"ram");
		Studentinfo ob2 = new Studentinfo(2,"shyam");
		Studentinfo ob3 = new Studentinfo(3,"mohan");
		Studentinfo ob4 = new Studentinfo(4,"xyz");
		
		List<Studentinfo> batc1 = new ArrayList<Studentinfo>();
		batc1.add(ob1);
		batc1.add(ob2);
		List<Studentinfo> batc2 = new ArrayList<Studentinfo>();
		batc2.add(ob4);
		batc2.add(ob3);
		HashMap<Integer,List<Studentinfo>> hm = new HashMap<Integer,List<Studentinfo>>();
        hm.put(10087,batc1);
        hm.put(9890,batc2);
        
        
        
        
        
        
        Set<Integer> s = hm.keySet();  // [10087, 8790]
        for(int i : s)
        {
        	if(i == 10087)
      //  System.out.println(hm.get(i)); // it will return arylst
        	{
		        for(Studentinfo si : hm.get(i))
		        {
		        	System.out.println(si + " "+ i + " "+hm.get(i).size());
		        }
        	}
        
        }
        
	}

}
