package corejavaBasics;

public class ConditionalStatementsDemo {
	

	public static void main(String[] args) {
		int a = 180;
		int b = 180;

		// Validation?
		// if conditon is TRUE, if block will execute
		// if conditon is FALSE, else block will execute
		if (a > b) {
			System.out.println("a contains large value compare with b");
		} else if (b > a) {
			System.out.println("b contains large value compare with a");
		} else {
			System.out.println("both are equal");
		}

	}

}
