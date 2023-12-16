package ItemnOrder;

public class Item {
	String itid;
	String itname;
	public Item(String itid, String itname) {
		super();
		this.itid = itid;
		this.itname = itname;
	}
	
	public void getItemDetails() {
		System.out.println("Item details Here : ");
		System.out.println("--------------------");
		System.out.println("Item Id : "+itid);
		System.out.println("Item Name : "+itname);
	}
}
