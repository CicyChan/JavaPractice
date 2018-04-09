package tutorial.java.basic.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test() {
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
		Calendar cal = Calendar.getInstance();
		
		date = cal.getTime();
		
		System.out.println(date);
		System.out.println(dateFormat.format(date));
		System.out.println(timeFormat.format(date));
	}

}
