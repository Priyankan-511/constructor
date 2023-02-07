package com.java.association.main;

public class Xworkz {
	public String Name;
	public int strength;
	public boolean useful;
	public Trainer hr =new Trainer() ;
	
	public void init(String name,int strength,boolean useful) {
	this.Name=name;
	this.strength=strength;
	this.useful=useful;
	System.out.println("String name,int strength,boolean useful");
		
	}

	public void show() {
	System.out.println("Name:"+Name);
	System.out.println("strength:"+strength);
	System.out.println("useful:"+useful);
	System.out.println("    ");
	this.hr.display1();
	
	}
	

		
	}


		



