package boot;

import thing.TV;

public class TvRunner {

	public static void main(String[] args) {

		TV tv = new TV("kodak", 10.65, "LED");
		System.out.println(tv.toString());

		System.out.println(tv.equals(tv));

		TV tv2 = new TV("samsung", 13.78d, "LCD");
		System.out.println(tv2.toString());

		System.out.println(tv.equals(tv2));

	}

}
