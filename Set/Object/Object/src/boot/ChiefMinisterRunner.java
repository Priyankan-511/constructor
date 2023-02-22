package boot;

import thing.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChiefMinister chiefMinister = new ChiefMinister();
		System.out.println(chiefMinister.toString());

		System.out.println(chiefMinister.equals(chiefMinister));

		ChiefMinister chiefMinister1 = new ChiefMinister();
		System.out.println(chiefMinister1.toString());

		System.out.println(chiefMinister1.equals(chiefMinister1));




	}

}
