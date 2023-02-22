package thing;

public class Alcohol {
	private String brand;
	private String type;
	private double percentage;
	private int price;

	public Alcohol() {
		System.out.println("no argument constructor");
	}

	public Alcohol(String brand, String type, double percentage, int price) {
		this.brand = brand;
		this.type = type;
		this.percentage = percentage;
		this.price = price;
	}

	public boolean equals(Object arg) {
		System.out.println("running equals in Cake" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof Alcohol) {
				System.out.println("arg is Cake");
				Alcohol casted = (Alcohol) arg;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.type == (right.type) && left.percentage == (right.percentage)
						&& left.price == (right.price)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.err.println("arg is not Alcohol");
			}
		} else {
			System.err.println("arg is null");
		}

		return false;
	}

	public String toString() {
		{
			return " [brand: " + this.brand + " ] [type:" + this.type + " ] [percentage:" + this.percentage
					+ "] [price:" + this.price + "]";
		}
	}
}
