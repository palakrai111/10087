package in.sp.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<StuComparator>
{

	@Override
	public int compare(StuComparator o1, StuComparator o2) {
		// TODO Auto-generated method stub
		if(o1.id == o2.id)
		{
		return 0;
		}else if(o1.id > o2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
