package boot;

import thing.Garland;
import thing.RoseGarland;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland garland = new RoseGarland();
		garland.Flower();
		garland.Length();

		Garland garland1 = new Garland();
		garland1.Flower();

	}

}
