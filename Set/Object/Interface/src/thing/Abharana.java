package thing;

public class Abharana implements GoldSeller{
	public Abharana() {
		System.out.println("Running Mahalaksmi with no arg constructor");
	}

	public double pricePerGram() {
		return 4300;
	}

	public String getGstNo() {
		return "345";
	}

	public String getLocation() {
		return "Belagavi";
	}

}
