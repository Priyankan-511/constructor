package thing;

public class people implements Eating {
	private String name;

	public void Customer() {
		System.out.println("Running in customer");
	}

	@Override
	public boolean washedhands(String name) {
		if (this.name != name && name.equals("seema")) {
			System.out.println("seema will not wash her hands");
			return false;
		} else {

			System.out.println("seema wil wash her hands");

		}
		return true;
	}

	public double durationTaken1() {
		if (this.name == "seema") {
			return 35;
		} else {

		}
		return 30;
	}

	@Override
	public double durationTaken() {
		// TODO Auto-generated method stub
		return 0;
	}
}
