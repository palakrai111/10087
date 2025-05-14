package in.sp.backend;

public class Employee 
{
	int eid;
	String ename;
	@Override
	public String toString() {
		return  eid + "*" + ename ;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
