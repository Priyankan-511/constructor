package boot;

public class City {
	public String name;
	public String district;
	public String capital;

	public City() {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;

	}

	public void setdistrict(String district) {
		this.district = district;
	}

	public void setcapital(String capital) {
		this.capital = capital;
	}

	public void display() {
		System.out.println("details about State");
		System.out.println("name:" + name);
		System.out.println("district:" + district);
	}
}
