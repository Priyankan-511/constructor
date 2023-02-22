package boot;

import thing.Park;

public class ParkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Park park = new Park();
		System.out.println(park.toString());

		System.out.println(park.equals(park));

		Park park1 = new Park();
		System.out.println(park1.toString());

		System.out.println(park1.equals(park1));



	}

}
