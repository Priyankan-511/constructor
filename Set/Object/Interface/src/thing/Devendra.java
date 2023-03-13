package thing;

public class Devendra implements GoldSeller {
	public Devendra() {
		System.out.println("Running DevendraSetu with no arg constructor");
	}

	public double pricePerGram() {
		return 4500;
	}

	public String getGstNo() {
		return "xyz";
	}

	public String getLocation() {
		return "Gokak";
	}

}
