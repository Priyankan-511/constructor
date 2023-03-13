package boot;

import thing.Home;


public class HomeRunner {
	public static void main(String[] args) {
		Home home = new Home();
		System.out.println(home.toString());

		@SuppressWarnings("unused")
		Home1 room = new Home1();
		System.out.println(home.toString());

		Home2 house = new Home2();
		System.out.println(house.toString());

	}
}
