package boot;

public class Security {
	public String deptname;
	public int totalstaff;
	public String headstaff;

	public Security() {
		System.out.println("no arg constructor");
	}

	public void setname(String deptname) {
		this.deptname = deptname;
	}

	public void setheadstaff(String headstaff) {
		this.headstaff = headstaff;
	}

	public void settotalstaff(int totalstaff) {
	this.totalstaff=totalstaff;
	}



	public void display () {
		System.out.println("details about Security");
		System.out.println("deptname:" + deptname);
		System.out.println("totalstaff:" + totalstaff);
		System.out.println("headstaff:" + headstaff);
	
}

	public static void setCompany(Security security) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

