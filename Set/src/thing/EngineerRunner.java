package thing;

import boot.Degree;
import boot.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer er = new Engineer();
		String[]skill = {"autocaed","rivet"};
		er.setskill(skill);
		
		Degree dr = new Degree();
		dr.setname("BE");
		dr.setduration(4);
		dr.setpursuing(false);
		dr.setpercentage(60);
		dr.setbranch("civil");
		Degree[] ref = {dr};
		er.setdegree(ref);
		er.display(0);
		

	}

}
