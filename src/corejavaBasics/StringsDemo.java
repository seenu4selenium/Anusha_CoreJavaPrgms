package corejavaBasics;

public class StringsDemo {

	public static void main(String[] args) {
//		int a = 90;
//		char b = 'r';
//		double c = 25235.235325;
//		

		String abc; // String declaration
		abc = "Hi"; // Assign a value to the String variable
		System.out.println(abc);

		String d = "My name is Anusha & mobile num is: 9874563210";
		System.out.println(d);

		System.out.println(abc + ", " + d);

		String e = "Hi AnuSha";
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());

		String f = "AnuSha";
		String g = "anuShaP";

		if (f.equals(g)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// equalsIgnoreCase: AnuSha = anusha
		if (f.equalsIgnoreCase(g)) {
			System.out.println("Both are equal*****");
		} else {
			System.out.println("Both are not equal*****");
		}

		String h = "Hello anusha, how is corejava sessions?";
		// validate/find 'h' String contains "Corejava" word?
		if (h.contains("Corejava")) {
			System.out.println("Corejava word is avaiable in 'h' String***");
		} else {
			System.out.println("Corejava word is NOT avaiable in 'h' String***");
		}

		// Length: starts from 1
		String i = "Hi All";
		System.out.println(i.length());

		// index: starts from 0
		String j = "Server";
		System.out.println(j.charAt(3));

		String c = "Selenium is web based Automation Tool.";
	
//		// 12-14
		for (int s = 12; s < 15; s++) {				
			System.out.print(c.charAt(s));
		}

		//" "
		
	}

}
