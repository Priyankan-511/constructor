package com.java.association.main;

public class Engine {
	public String company;
	public int price;
	public boolean liteweight;
	public Bike ref= new Bike();
	
	
	public void init(String company,int price,boolean liteweight) {
		this.company=company;
		this.price=price;
		this.liteweight=liteweight;
		
	}
	public void show() {
		System.out.println("Company:"+company);
		System.out.println("price:"+price);
		System.out.println("liteweight:"+liteweight);
		System.out.println(" ");
		this.ref.show();
	}
	
	
		

}

