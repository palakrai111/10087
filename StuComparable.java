package in.sp.collection;

public class StuComparable implements Comparable<StuComparable>
{
    int id;
    String name;
	public StuComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(StuComparable o) {
		// TODO Auto-generated method stub
		
		if(id == o.id)
		{
		return 0;
		}else if(id >o.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
