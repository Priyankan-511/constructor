package com.xworkz.association1.thing;

public class ary {
	public static void main(String arg[]) {
		int num = 3;
		int i, j;
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 1 || i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2
						|| i == 3 && j == 3) {
					System.out.print(j);
				} else {
					System.out.println();
				}

			}
			System.out.println(" ");

		}
	}
}
