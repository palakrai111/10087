package in.sp.collection;

import java.util.ArrayList;
import java.util.List;

public class EmpCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> l3 = new ArrayList<Emp>();
		l3.add(new Emp(1,"palak"));
		l3.add(new Emp(2,"nayan"));
		l3.add(new Emp(3,"raza"));
		l3.add(new Emp(4,"rohit"));
		l3.add(new Emp(5,"shay"));
		boolean found = false;
		for(Emp  e: l3)
		{
			if(e.name.equals("p"))
			{
				found = true;
				break;
			}
			
		}
		if(found)
		{System.out.println("found");}
		else
		{System.out.println("not found");}

	}

}
