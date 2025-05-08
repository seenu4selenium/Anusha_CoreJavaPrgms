package corejavaBasics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);//Wed Apr 30 17:59:19 MDT 2025
		//yyyyMMMdd_HHmmss
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		//convert system defalut data to user defined format
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
	}

}
