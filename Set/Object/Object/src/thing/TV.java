package thing;

public class TV extends Object {

	public String brand;
	public int price;
	public int size;

	public TV() {
		System.out.println("no argument constructor");
	}

	public TV(String string, double d, String string2) {

	}

	public void Tv(String brand, int price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public boolean equals(Object obj) {
		System.out.println("running equlas in tv" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof TV) {
				System.out.println("obj is tv");
				TV casted = (TV) obj;
				TV left = this;
				TV right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left is equal to right");
					return true;

				} else {
					System.out.println("left is not equal to right");
				}
			} else {
				System.out.println("obj is  not a tv");
			}

		} else {
			System.out.println("obj is null");
		}
		return false;
	}
		
		
		public String toString() {
			{
				return " brand: " + this.brand + "  \n price:" + this.price + "\n  size:" + this.size ;
			}

	}
}

