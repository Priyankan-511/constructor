package boot;

import thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fridge fridge = new Fridge();
		System.out.println(fridge.toString());

		System.out.println(fridge.equals(fridge));

		Fridge fridge1 = new Fridge();
		System.out.println(fridge1.toString());

		System.out.println(fridge1.equals(fridge1));



	}

}
