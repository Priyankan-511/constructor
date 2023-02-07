package com.java.association.main;

public class Trainer {
	public String Name;
	public int Strength;
	public boolean informative;
	
	public void init(String Name,int Strength,boolean informative) {
		this.Name=Name;
		this.Strength=Strength;
		this.informative=informative;
	}
	public void display1() {
		System.out.println("Name:"+Name);
		System.out.println("Strength:"+Strength);
		System.out.println("informative"+informative);
		
		
		
	}
	

}
