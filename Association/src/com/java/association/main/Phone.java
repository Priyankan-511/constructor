package com.java.association.main;

public class Phone {
	public String company;
	public int price;
	public boolean liteweight;
	public PhoneCamara cmr= new PhoneCamara ();
	
	public void init(String company,int price,boolean liteweight) {
		this.company=company;
		this.price=price;
		this.liteweight=liteweight;
		
	}
	public void show() {
		System.out.println("Company:"+company);
		System.out.println("price:"+price);
		System.out.println("liteweight:"+liteweight);
		System.out.println("");
		this.cmr.display1();
		
	}

}
