package mainpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDateRhr2dates {
	
	public CalendarDateRhr2dates() throws ParseException {
		
		
		Date dateStart = new Date();
		
		for (int i = 0; i < 1000; i++) {
			System.out.print("něco dělám");
		}

		Date dateFinish = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("EEE dd.MM.yyyy HH:mm:ss.SSS");
		
		System.out.println("Něco jsem dodělal...");
		System.out.println("Datum start : "+dateFormat.format(dateStart)+", miliseconds="+dateStart.getTime());
		System.out.println("Datum finish: "+dateFormat.format(dateFinish)+", miliseconds="+dateFinish.getTime());
		long duration = dateFinish.getTime() - dateStart.getTime();
		System.out.println("duration in miliseconds = " + duration);
		
	}
}

