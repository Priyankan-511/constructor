package thing;

public class Fish {
	private String flavore;
	private String weight;
	private String shape;
	private int price;

	public Fish() {
		System.out.println("no argument constructor");
	}

	public Fish(String flavore, String weight, String shape,int price) {
		this.flavore = flavore;
		this.weight = weight;
		this.shape = shape;
		this.price=price;
	}

	public boolean equals(Object arg) {
		System.out.println("running equals in Cake" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof Cake) {
				System.out.println("arg is Fish");
				Fish casted = (Fish) arg;
				Fish left = this;
				Fish right = casted;
				if (left.flavore.equals(right.flavore) && left.weight == (right.weight) && left.shape.equals(right.shape) &&left.price==(right.price)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.err.println("arg is not Fish");
			}
		} else {
			System.err.println("arg is null");
		}

		return false;
	}

	public String toString() {
		{
			return " [flavore: " + this.flavore + " ] [weight:" + this.weight + " ] [shape:" + this.shape + "] [price:" + this.price+"]";
		}
	}
}

