package thing;

public class Door {
	private String brand;
	private int length;
	private double price;
	private String colour;

	public Door() {
		System.out.println("no argument constrctr");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setlength(int length) {
		this.length = length;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int hashcode() {
		return 1234;
	}

	public String toString() {
		return "brand:" + this.brand +length + this.length + "price:" + this.price + "colour:" + this.colour;
	}

}


