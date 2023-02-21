package thing;

public class Coconut {
	private String brand;
	private int daimeter;
	private double price;
	private String colour;

	public Coconut() {
		System.out.println("no argument constrctr");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setDaimeter(int daimeter) {
		this.daimeter = daimeter;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int hashcode() {
		return 234;
	}

	public String toString() {
		return "brand:" + this.brand + daimeter + this.daimeter + "price:" + this.price + "colour:" + this.colour;
	}

}


