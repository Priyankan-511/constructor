package boot;

public class Degree {
	public String name;
	int duration;
	boolean pursuing;
	double percentage;
	String branch;

	public void display() {
		System.out.println("no arg constructor of degree");
	}

	public void setname(String name) {
		this.name = name;

	}

	public void setduration(int duration) {
		this.duration = duration;
	}

	public void setpursuing(boolean pursuing) {
		this.pursuing = pursuing;
	}

	public void setpercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setbranch(String branch) {
		this.branch = branch;
	}

	public void display1() {
		System.out.println("information about degree");
		System.out.println("name:" + name);
		System.out.println("duration:" + duration);
		System.out.println("pursuing:" + pursuing);
		System.out.println("percentage:" + percentage);
		System.out.println("branch:" + branch);

	}
}
