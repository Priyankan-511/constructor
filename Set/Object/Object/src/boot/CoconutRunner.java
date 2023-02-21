package boot;

import thing.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coconut coconut = new Coconut();
		coconut.setBrand("priya");
		coconut.setDaimeter(5);
		coconut.setColour("green");
		coconut.setPrice(5);
		System.out.println(coconut);
		

		Coconut Coconut = new Coconut();
		coconut.setBrand("priya");
		coconut.setDaimeter(2);
		coconut.setColour("maroon");
		coconut.setPrice(5);
		System.out.println(coconut);

		System.out.println("hashcode is" + coconut.hashcode() + "origin hashcode is " + System.identityHashCode(coconut));

		System.out.println(Coconut.equals(coconut));

	}
}
