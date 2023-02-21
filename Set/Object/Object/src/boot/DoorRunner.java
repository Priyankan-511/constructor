package boot;

import thing.Door;

public class DoorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
		door.setBrand("wodword");
		door.setlength(7);
		door.setColour("black");
		door.setPrice(5155);
		System.out.println(door);
		

		Door Coconut = new Door();
		door.setBrand("wodword");
		door.setlength(7);
		door.setColour("black");
		door.setPrice(5155);
		System.out.println(door);

		System.out.println("hashcode is" + door.hashcode() + "origin hashcode is " + System.identityHashCode(door));

		System.out.println(Coconut.equals(door));

	}
}
