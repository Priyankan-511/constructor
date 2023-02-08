package com.xworkz.association1.boot;

import com.xworkz.association1.thing.*;

public class MoneyRunner {

	public static void main(String[] args) {
		Money ref = new Money();
		ref.display1();

		Wallet ref1 = new Wallet();
		ref1.init("bundle", 1000, false);
		ref1.show();
	}

}
