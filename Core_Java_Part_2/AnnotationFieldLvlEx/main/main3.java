package main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import ItemnOrder.Item;
import ItemnOrder.Order;
import restaurant.Restaurent;

public class main3 {

	public static void main(String[] args) throws Exception {
		Item it = new Item("I-111", "Pizza");
		Order od = new Order("O-111", it, "Pizza", "2468");
		od.getOrderDetails();
		System.out.println();
		
		Class cl =od.getClass();
		Field fd = cl.getDeclaredField("item");
		Annotation ann = fd.getAnnotation(Restaurent.class);
		Restaurent rst = (Restaurent)ann;
		System.out.println("Restaurent Details here : ");
		System.out.println("Restaurent Name : "+rst.resname());
		System.out.println("Restaurent Address : "+rst.resadd());
				
	}

}
