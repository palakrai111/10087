package in.sp.backend;

public class EmployeeEncap {
	
	private int id;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>10)
		{
		this.id = id;
		}else
		{
			System.out.println("not valid");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email.contains("@"))
		{
		this.email = email;
		}else
		{
			System.out.println("invalid");
		}
	}
	

}
