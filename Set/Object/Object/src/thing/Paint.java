package thing;

public class Paint {
	private String brand;
	private int noofbox;
	private double price;
	private String colour;

	public Paint() {
		System.out.println("no argument constrctr");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setnoofbox(int noofbox) {
		this.noofbox = noofbox;
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
		return "brand:" + this.brand + ":no of box" + this. noofbox + "price:" + this.price + "colour:" + this.colour;
	}

}


