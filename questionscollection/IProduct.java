package in.sp.questionscollection;

public class IProduct {
	
	String name;
	int quantity;
	@Override
	public String toString() {
		return "IProduct [name=" + name + ", quantity=" + quantity + "]";
	}
	public IProduct(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
