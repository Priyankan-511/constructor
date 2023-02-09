package boot;

public class Engineer {
	public String name="priyanka";
	public double salary=25000.0d;
	public String[] skills;
	public Degree[] degrees;

	public Engineer() {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setskill(String[] skills) {
		this.skills = skills;
	}

	public void setdegree(Degree[] degrees) {
		this.degrees = degrees;
	}

	public void display(int num) {
		System.out.println("details about Engineer");
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
		System.out.println("degrees:" + degrees);

		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println("skills:" + element + " at index" + seq);
			}
		} else {
			System.out.println("skills are not null");

			if (this.degrees != null) {
				for (int num1 = 0; num1 < this.degrees.length; num1++)
					;
				{
					Degree element = this.degrees[num];
					element.display();
				}
			} else {
				System.out.println("Degree is not null");

			}
		}
	}

	public void setSkills(String[] skill) {
		// TODO Auto-generated method stub
		
	}
}
