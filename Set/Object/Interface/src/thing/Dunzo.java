package thing;

public class Dunzo implements Deliveryy {

	public double charges() {
		System.out.println("Running charger in Dunzo");
		return 0;
	}


	public double timeTaken() {
		System.out.println("Running timeTaken in Dunzo");
		return 0;
	}

	public String agentName(int rating) {
		System.out.println("Running agentName in Dunzo");
		if (rating == 1) {
			System.out.println("Rating is 1");
			return "Basavraj";
		}
		if (rating == 2) {
			System.out.println("Rating is 2");
			return "Dinakar";
		}
		if (rating == 3) {
			System.out.println("Rating is 3");
			return "shiv";
		}

		return "others";
	}

}
