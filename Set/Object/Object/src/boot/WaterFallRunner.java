package boot;

import thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterFall waterFall = new WaterFall();
		System.out.println(waterFall.toString());

		System.out.println(waterFall.equals(waterFall));

		@SuppressWarnings("unused")
		WaterFall waterFall1 = new WaterFall();
		System.out.println(waterFall.toString());

		System.out.println(waterFall.equals(waterFall));



	}

}
