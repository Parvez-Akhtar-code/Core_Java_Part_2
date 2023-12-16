package ItemnOrder;

import restaurant.Restaurent;

public class Order {
	String Oid;
	@Restaurent
	Item item;
	String Oname;
	String cusid;
	public Order(String oid, Item item, String oname, String cusid) {
		super();
		Oid = oid;
		this.item = item;
		Oname = oname;
		this.cusid = cusid;
	}
	
	public void getOrderDetails() {
		System.out.println("Order Details Here : ");
		System.out.println("---------------------");
		System.out.println("Order Id : "+Oid);
		System.out.println("Order Name : "+Oname);
		System.out.println("Customer Id : "+cusid);
		System.out.println();
		item.getItemDetails();
	}
	
	
}
