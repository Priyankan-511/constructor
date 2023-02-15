package thing;

import boot.Alcohol;
import boot.Whiskey;

public class WhiskeyRunner {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Alcohol.alcohol = new Alcohol();
		Alcohol.quility();
		Alcohol.getBrand();

		Whiskey whiskey = new Whiskey();
		whiskey.getBrand();
		Alcohol.whiskey();

		Alcohol cast = (Alcohol) whiskey;
		cast.qulity();

	}

}
