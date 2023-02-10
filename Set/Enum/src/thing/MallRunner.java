package thing;

import boot.Mall;
import boot.Security;

public class MallRunner {

	public static void main(String[] args) {
		Mall mall = new Mall("basaveswar nagar","good");
		mall.display();
		
		Security security = new Security();
		Security.setCompany(security);
		security.display();

	}

}
