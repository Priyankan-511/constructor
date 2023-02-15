
package boot;

public class Area {
	public String name;
	public int population;
	public String street;

	public Area() {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setpopulation(int population) {
		this.population = population;
	}

	public void setstreet(String street) {
		this.street = street;
	}
	
	public void display() {
		System.out.println("details about Area");
		System.out.println("name:" + name);
		System.out.println("population:" + population);
		System.out.println("street:"+street);
	}
}
