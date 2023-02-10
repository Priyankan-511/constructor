package boot;

public class Company {
	public String name;
	public String ceoname;
	public int since;
	public String adress;
	
	public Company() {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setceoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public void setsince(int since) {
	this.since=since;
	}
public void setadress(String adress) {
	this.adress=adress;
}


	public void display () {
		System.out.println("details about Company");
		System.out.println("name:" + name);
		System.out.println("ceoname:" + ceoname);
		System.out.println("since:" + since);
		System.out.println("adress:"+adress);
	
}

	

}
