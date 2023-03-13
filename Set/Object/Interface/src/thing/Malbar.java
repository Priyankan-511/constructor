package thing;

public class Malbar implements GoldSeller{
	public Malbar() {
		System.out.println("Running Malabar with no arg constructor");
	}

	
	public double pricePerGram() {
		return 5200;
	}
	public String getGstNo() {
		return "A152S5555S1A";
	}

	public String getLocation() {
		return "Tumkur";
	}

}
