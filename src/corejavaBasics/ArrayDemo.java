package corejavaBasics;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[] = { 90, 343, 43, 564, 576, 587, 98 };
		String b[] = { "Hi", "dsfgfdg", "$%3$^#6sdfgf", "34654754" };

		// a[Index]
//		System.out.println(a[1]);
//		System.out.println(b[0]);
		System.out.println(a.length);
		System.out.println("******************");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("******************");

		for (int j = 0; j < 4; j++) {
			System.out.println(b[j]);
		}
		System.out.println("******************");

		String c = "Selenium is web based Automation Tool.";
		String d[] = c.split(" ");
		// pring all values from d Array
		for (int k = 0; k < d.length; k++) {
			// Validate web word is present or not?
			if (d[k].equals("web")) {
				System.out.println(d[k]);
			}
		}

		// Print '87' number into console
		int g[] = { 23590, 3423463, 432, 562354, 66576, 87, 93468 };
		// System.out.println(g[5]);
		// Verify the given array value is 87 or not?
		for (int i = 0; i < g.length; i++) {
			if (g[i] == 87) {
				System.out.println(g[i] + " is matching with 87 number***");
			} else {
				System.out.println(g[i] + " is not matching with 87 number***");
			}
		}
		System.out.println("#################################");

//		ADVANCED FOR LOOP / ENHANCED FOR LOOP / FOR-EACH Loop
		int groupOfValues[] = { 90, 343, 43, 564, 576, 587, 98 };
		for (int abc : groupOfValues) {
			System.out.println(abc);
		}

		System.out.println("////////////////////////////");

		String abc[] = { "Hi", "Anusha", "$%3$", "34654754", "How are you?" };
		for (String anu : abc) {
			System.out.println(anu);
		}
	}
}
