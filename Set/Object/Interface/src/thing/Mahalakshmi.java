package thing;

public class Mahalakshmi implements GoldSeller {
	public Mahalakshmi() {
		System.out.println("Running Mahalaksmi with no arg constructor");
	}

	public double pricePerGram() {
		return 4200;
	}

	public String getGstNo() {
		return "123dtd";
	}

	public String getLocation() {
		return "Belagavi";
	}

}
