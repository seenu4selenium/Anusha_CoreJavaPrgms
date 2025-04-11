package corejavaBasics;

public class MethodDemo {
	// Create a customized method
	public static void add() {
		int a = 989;
		int b = 880;		
		System.out.println("I am ADD method");
		System.out.println(a+b);
	}

	public static void sub() {
		int a = 520;
		int b = 110;
		System.out.println("I am Sub method");
		System.out.println(a-b);
	}

	public static void main(String[] args) {

		//System.out.println("I am Main Method");
		// method calling
		//add();
		sub();
		add();
		add();
		add();
		

	}

}
