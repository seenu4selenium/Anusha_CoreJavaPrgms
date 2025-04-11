package corejavaBasics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		int a;
		int b;
		System.out.println("Please type a&b int values: ");
		
		//Create an object for Scanner java class
		//Syntax: CLASSNAME objectName = new CLASSNAME();
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(a + b);
	}

}
