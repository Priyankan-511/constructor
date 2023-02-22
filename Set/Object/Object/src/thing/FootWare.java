package thing;

public class FootWare extends Object {
	private String brand;
	private double size;
	private String type;

	public FootWare() {
		System.out.println("no argument constructor");
	}

	public FootWare(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	public boolean equals(Object arg) {
		System.out.println("running equals in FootWare" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof FootWare) {
				System.out.println("arg is FootWare");
				FootWare casted = (FootWare) arg;
				FootWare left = this;
				FootWare right = casted;
				if (left.brand.equals(right.brand) && left.size == (right.size) && left.type.equals(right.type)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.err.println("arg is not FootWare");
			}
		} else {
			System.err.println("arg is null");
		}

		return false;
	}

	public String toString() {
		{
			return " [brand: " + this.brand + " ] [size:" + this.size + " ] [type:" + this.type + "]";
		}
	}
}
