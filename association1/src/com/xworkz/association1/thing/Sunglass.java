package com.xworkz.association1.thing;

public class Sunglass {
	public String brand;
	public int price;
	public boolean stylish;
	
	
	public void init(String brand,int price,boolean stylish) {
		this.brand=brand;
		this.price=price;
		this.stylish=stylish;
	}
	public void display1() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("stylish:"+stylish);
	}
}
