package boot;

public class Country {
	public String name;
	public String presidnt;
	public boolean developed;

	public Country() {
		System.out.println("no arg constructor");
	}

	public void setpresidnt(String presidnt) {
		this.presidnt = presidnt;
	}

	public void setdeveloped(boolean developed) {
		this.developed = developed;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("details about Company");
		System.out.println("name:" + name);
		System.out.println("presidnt:" + presidnt);
		System.out.println("developed:" + developed);
	}

	public void setCountry(Country country) {
		// TODO Auto-generated method stub
		
	}
}
