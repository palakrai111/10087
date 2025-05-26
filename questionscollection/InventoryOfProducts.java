package in.sp.questionscollection;

import java.util.ArrayList;

public class InventoryOfProducts {
	ArrayList<IProduct> products;
	InventoryOfProducts()
	{
		products = new ArrayList<IProduct>();
		
	}
	void addProduct(IProduct ip)
	{
		products.add(ip);
	}
	void removeProduct(IProduct ir)
	{
		products.remove(ir);
	}
	
	void getAllProducts()
	{
		for(IProduct p :products )
		{
			System.out.println(p.getName() + " " + p.getQuantity());
		}
	}
	void checkLowInventory()
	{
		for(IProduct p :products )
		{
			if(p.getQuantity() < 100)
			{
				System.out.println(p.getName() + " " + p.getQuantity());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InventoryOfProducts ob = new InventoryOfProducts();
		
		
		IProduct p1 = new IProduct("shirt",100);
		IProduct p2 = new IProduct("pant",50);
		IProduct p3 = new IProduct("tie",130);
		IProduct p4 = new IProduct("shoes",30);
		IProduct p5 = new IProduct("shocks",30);
		ob.addProduct(p3);
		ob.addProduct(p2);
		ob.addProduct(p1);
		ob.addProduct(p4);
		ob.addProduct(p5);
		ob.getAllProducts();
		ob.removeProduct(p1);
		System.out.println("after removing product");
		ob.getAllProducts();
		ob.checkLowInventory();
		

	}

}
