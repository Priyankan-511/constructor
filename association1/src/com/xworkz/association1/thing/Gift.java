package com.xworkz.association1.thing;

public class Gift {
	public String item;
	public int price;
	public boolean useful;
	
	
	public void init(String item,int price,boolean useful) {
		this.item=item;
		this.price=price;
		this.useful=useful;
	}
	public void display1() {
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		System.out.println("useful:"+useful);
	}
}
	


