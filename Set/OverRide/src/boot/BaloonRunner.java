package boot;

import thing.Baloon;
import thing.Roundbaloon;

public class BaloonRunner {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Baloon baloon = new Roundbaloon();
		Baloon baloon2 = new Baloon();
		baloon2.Colour();
		Baloon.getType();

		@SuppressWarnings("unused")
		Baloon baloon1 = new Baloon();
		getColour();

	}

	private static void getColour() {
		// TODO Auto-generated method stub

	}

}
