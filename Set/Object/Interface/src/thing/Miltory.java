package thing;

public class Miltory {
	public Eating eatingRule;

	public void Military(Eating eatingRule) {
		this.eatingRule = eatingRule;
	}

	public void checkEatingRule() {
		boolean wash = this.eatingRule.washedhands("seema");
		double duration = this.eatingRule.durationTaken();

		if (duration <= Eating.Duretion && wash) {
			System.out.println("Eating in good way");
		} else {
			System.out.println("Eating in bad way");

		}
	}
}
