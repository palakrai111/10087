
public class Studentinfo {
	
	int id;
	String name;
	@Override
	public String toString() {
		return "Studentinfo [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Studentinfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
