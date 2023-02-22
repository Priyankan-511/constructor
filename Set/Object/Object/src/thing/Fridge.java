package thing;

public class Fridge {
	private String name;
	private int height;
	private String location;


	public Fridge() {
		System.out.println("no argument constructor");
	}

	public Fridge(String name, int height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	
	}
	

	public boolean equals(Object arg) {
		System.out.println("running equals in WaterFall" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof Fridge) {
				System.out.println("arg is Fridge");
				Fridge casted = (Fridge) arg;
				Fridge left = this;
				Fridge right = casted;
				if (left.name.equals(right.name) && left.height == (right.height) && left.location.equals(right.location)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.err.println("arg is not Fridge");
			}
		} else {
			System.err.println("arg is null");
		}

		return false;
	}

	public String toString() {
		{
			return " [name: " + this.name + " ] [height:" + this.height + " ] [location:" + this.location + "]";
		}
	}


}
