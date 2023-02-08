package com.xworkz.association1.thing;

public class Fridge {
	public String brand;
	public int price;
	public boolean useful;
	
	
	public void init(String brand,int price,boolean useful) {
		this.brand=brand;
		this.price=price;
		this.useful=useful;
	}
	public void display1() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("useful:"+useful);
	}
}
		
		
		
		
		
		
		
	
	
	


