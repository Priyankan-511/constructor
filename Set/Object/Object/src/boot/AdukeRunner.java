package boot;

import thing.Adike;

public class AdukeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adike adike = new Adike();
		adike.setBrand("priya");
		adike.setDaimeter(2);
		adike.setColour("maroon");
		adike.setPrice(5);
		System.out.println(adike);
		

		Adike adike2 = new Adike();
		adike.setBrand("priya");
		adike.setDaimeter(2);
		adike.setColour("maroon");
		adike.setPrice(5);
		System.out.println(adike2);

		System.out.println("hashcode is" + adike.hashcode() + "origin hashcode is " + System.identityHashCode(adike2));

		System.out.println(adike.equals(adike2));

	}


	}


