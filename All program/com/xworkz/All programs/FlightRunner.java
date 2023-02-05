package com.xworks.things;


public class FlightRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight ref=new Flight();

		System.out.println(ref.name);
		System.out.println(ref.colour);
		System.out.println(ref.type);
		System.out.println(ref.location);
		System.out.println(ref.type);
		System.out.println(ref.capacity);
		System.out.println(ref.strength);
		System.out.println(ref.price);
		System.out.println(ref.count);
		System.out.println(ref.full);
		
		ref.name="vistara";
		ref.colour="white";
		ref.type="domestic";
		ref.location="banglore";
		ref.type="cmerical";
		ref.strength="full";
		ref.price=1000;
		ref.count=50;
		ref.full=true;
		
		System.out.println(ref.name);
		System.out.println(ref.colour);
		System.out.println(ref.type);
		System.out.println(ref.location);
		System.out.println(ref.type);
		System.out.println(ref.capacity);
		System.out.println(ref.strength);
		System.out.println(ref.price);
		System.out.println(ref.count);
		System.out.println(ref.full);
		
		

}
}
