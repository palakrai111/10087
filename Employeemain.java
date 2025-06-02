import java.util.HashMap;
import java.util.*;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101,"A");
		Employee e2 = new Employee(102,"B");
		Employee e3 = new Employee(103,"C");
		Employee e4 = new Employee(104,"D");
		
		List<Employee> emplist1 = new ArrayList<Employee>();
		emplist1.add(e1);
		emplist1.add(e2);
		
		List<Employee> emplist2 = new ArrayList<Employee>();
		emplist2.add(e3);
		emplist2.add(e4);
		
		
		HashMap<Integer,List<Employee>> hm = new HashMap<Integer,List<Employee>>();
		
		hm.put(1, emplist1);
		hm.put(2, emplist2);
		
		
		Set<Integer> s = hm.keySet(); //[1,2]
		
		for(int i : s)
		{
			//System.out.println(hm.get(i));
			if(i == 2)
			{
			for(Employee e : hm.get(i))
			{
				System.out.println(e.getId() + " "+e.getName());
			}
			}
		}

	}

}
