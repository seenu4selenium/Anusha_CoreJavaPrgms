package corejavaBasics;

import java.util.Scanner;

public class Tablesdemo {

	public static void main(String[] args) {
		
		int tableNum ;
		//Create an object for Scanner class
		//CLASSNAME referenceName = NEW CLASSNMAE();		
		Scanner sc = new Scanner(System.in);
		tableNum = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			//15 * 1 =  15*1
			System.out.println(tableNum + "*" + i + "=" + (tableNum * i));

		}

	}

}
