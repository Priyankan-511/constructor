package com.java.association.main;

public class Camara {

		public String company;
		public int price;
		public boolean liteweight;
	
		
		public void init(String company,int price,boolean liteweight) {
			this.company=company;
			this.price=price;
			this.liteweight=liteweight;
			
		}
		public void display1() {
			System.out.println("Company:"+company);
			System.out.println("price:"+price);
			System.out.println("liteweight:"+liteweight);
		
			
		}

	}



