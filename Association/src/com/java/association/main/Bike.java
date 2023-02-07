package com.java.association.main;

public class Bike {
	public String Brand = "ktm";
	public int price = 200000;
	public boolean Comfert = true;
	


	public void init(String Brand, int price, boolean Comfert) {
	this.Brand = Brand;
	this.price = price;
	this.Comfert = Comfert;
	}

	
	public void show() {
	System.out.println("Brand:"+Brand);
	System.out.println("price;+price");
	System.out.println("comfert:"+Comfert);

	
	}
}
	

	


