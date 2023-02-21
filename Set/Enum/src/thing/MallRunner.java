package thing;

import boot.Company;
import boot.Country;
import boot.Mall;
import boot.Security;


public class MallRunner {

	public static void main(String[] args) {
		Mall mall = new Mall("basaveswar nagar", "good");
		mall.display();

		Security security = new Security();
		Security.setCompany(security);
		security.display();

		Company company = new Company();
		Company.setCompany(company);
		company.display();

	
		Object Degree;
		Degree degree = new Degree();
		Degree.setDegree(degree);
		degree.display();
		
		Country Country = new Country();
		Country.setCountry(Country);
		Country.display();

	}

}
