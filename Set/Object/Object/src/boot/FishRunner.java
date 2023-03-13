package boot;

import thing.Fish;

public class FishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish = new Fish();
		System.out.println(fish.toString());

		System.out.println(fish.equals(fish));

		Fish fish1 = new Fish();
		System.out.println(fish1.toString());

		System.out.println(fish1.equals(fish1));

	}

}
