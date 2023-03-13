package boot;

import thing.Abharana;
import thing.Anitha;
import thing.Bhairavi;
import thing.Devendra;
import thing.GoldSeller;
import thing.Mahalakshmi;
import thing.Malbar;
import thing.Priyanka;
import thing.Shruti;

public class GoldSellerRunner {
	public static void main(String[] args) {

		GoldSeller seller = new Malbar();

		Bhairavi bhairavi = new Bhairavi(seller);
		bhairavi.bangaraKaridi();

		System.out.println("--------------------------");

		GoldSeller seller1 = new Devendra();

		Shruti shruti = new Shruti(seller1);
		shruti.chinnaTago();

		System.out.println("-----------------------------");

		GoldSeller seller2 = new Abharana();

		Priyanka priyanka = new Priyanka(seller2);
		priyanka.purchaseGold();

		System.out.println("--------------------------------");

		GoldSeller seller3 = new Mahalakshmi();

		Anitha anitha = new Anitha(seller3);
		anitha.buyGold();

	}

}
