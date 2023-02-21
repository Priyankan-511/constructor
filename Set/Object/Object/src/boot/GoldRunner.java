package boot;

import thing.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold = new Gold();
		gold.setBrand("GRT");
		gold.setDaimeter(1);
		gold.setColour("gold");
		gold.setPrice(50000);
		System.out.println(gold);

		Gold gold1 = new Gold();
		gold1.setBrand("GRT");
		gold1.setDaimeter(1);
		gold1.setColour("gold");
		gold1.setPrice(50000);
		System.out.println(gold1);

		System.out.println("hashcode is" + gold1.hashcode() + "origin hashcode is " + System.identityHashCode(gold1));

		System.out.println(gold.equals(gold1));

	}

}
