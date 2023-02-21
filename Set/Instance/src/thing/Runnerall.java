package thing;

import boot.RagiRoti;
import boot.Roti;

public class Runnerall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Roti roti =new Roti();
		System.out.println("**************");
		
		RagiRoti ragiRoti = new RagiRoti();
		ragiRoti.getCalries();
		ragiRoti.getWeight();
		
		if(roti instanceof RagiRoti) {
			RagiRoti castd=(RagiRoti)roti;
			castd.getCalries();
		}
		else {
		System.err.println("roti is not instance of RagiRoti");
	}

	}
}

