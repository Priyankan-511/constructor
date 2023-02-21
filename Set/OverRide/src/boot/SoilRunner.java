package boot;

import thing.RedSoil;
import thing.Soil;

public class SoilRunner {

	public static void main(String[] args) {
		Soil soil = new RedSoil();
		soil.fertility();// override
		soil.getType();

		Soil soil1 = new Soil();
		soil1.fertility();

	}

}
