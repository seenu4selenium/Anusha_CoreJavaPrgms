package corejavaBasics;

public class VariablesDemo {
	// Global Variable: a,b
	public static int a = 100;
	public static int b = 50;

	public static void add() {
		// Local Variables: a, b
		int a = 98;
		// int b = 80;
		System.out.println("I am ADD method");
		System.out.println(a + b);
	}

	public static void sub() {
		// Local Variables: a, b
		// int a = 52;
		// int b = 11;
		System.out.println("I am Sub method");
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add();
		sub();
	}

}
