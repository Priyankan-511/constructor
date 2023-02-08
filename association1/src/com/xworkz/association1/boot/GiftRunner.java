package com.xworkz.association1.boot;
import com.xworkz.association1.thing.*;

public class GiftRunner {

	public static void main(String[] args) {

		Gift ref = new Gift();
		ref.init("teddy", 2000, true);
		ref.display1();

		Box show = new Box();
		show.init1("paper", 100,false);
		show.show();


	}

}
