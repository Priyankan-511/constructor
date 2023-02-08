package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Chees;
import com.xworkz.association1.thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge ref = new Fridge();
		ref.init("LG", 20000, true);
		ref.display1();

		Chees ref1 = new Chees();
		ref1.init("amul", 180, false);
		ref1.show();
	}

}
