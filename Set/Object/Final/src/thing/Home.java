package thing;

public class Home {
	private String name;
	private String adress;
	private String location;
	private final float homeno=916;
	@Override
	public String toString() {
		return "Home [name=" + name + ", adress=" + adress + ", location=" + location + ", homeno=" + homeno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public
	String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getHomeno() {
		return homeno;
	}
	

}
