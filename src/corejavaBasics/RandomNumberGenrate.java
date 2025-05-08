package corejavaBasics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomNumberGenrate {
	//0-100
	public static void main(String[] args) throws Exception {
		Random r = new Random();
		int abc = r.nextInt(1000);
		System.out.println(abc);
		System.out.println("**********************");
		
		for (int i = 0; i <10; i++) {
			Date d = new Date();
			DateFormat df = new SimpleDateFormat("yyMMddHHmmss");
			String timeStamp = df.format(d);//250505182906		
			//Anushatest250505182906@yahho.com
			String email = "Anushatest" + timeStamp + "@yahho.com";
			System.out.println(email);
			Thread.sleep(1000);
		}
		
	}
}
