package boot;

public class State {
	public String name;
	public String cmname;

	public State() {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;

	}

	public void setcmname(String cmname) {
		this.cmname = cmname;
	}

	public void display() {
		System.out.println("details about State");
		System.out.println("name:" + name);
		System.out.println("cmname:" + cmname);

	}
}
