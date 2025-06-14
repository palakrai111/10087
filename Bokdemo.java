import java.util.Objects;

public class Bokdemo {
	
	int id;
	@Override
	public int hashCode() {
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bokdemo other = (Bokdemo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	String name;
	public Bokdemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
