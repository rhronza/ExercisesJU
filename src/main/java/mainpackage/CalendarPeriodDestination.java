package mainpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CalendarPeriodDestination {

	private static final long PERIOD_36_HOURS = 36 * 60 * 60 * 1000; /* 36 hodin * 60 minut * 60 sekund * 1000 milisecond */
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("EEE dd.MM.yyyy HH:mm:ss.SSS");

	List<Date> dateItems = new ArrayList<>();

	public CalendarPeriodDestination() {
		
		long milisecondBefore = 0;

		Calendar dnes = Calendar.getInstance();
		int rok = dnes.get(Calendar.YEAR);
		int mesic = dnes.get(Calendar.MONTH);
		int hodin = dnes.get(Calendar.HOUR_OF_DAY);
		int minut = dnes.get(Calendar.MINUTE);
		int sekund = dnes.get(Calendar.SECOND);
		for (int i = 20; i < 35; i++) {
			dnes.set(rok , mesic, i, hodin, minut, sekund);
			dateItems.add(dnes.getTime());
		}
		
		
		Date dnesDate = new Date();
		Date before36Hours = new Date(dnesDate.getTime() - PERIOD_36_HOURS);
		
		System.out.println("Dnes je             :"+DATE_FORMAT.format(dnesDate.getTime()));
		System.out.println("Před 36 hodinmi bylo:"+DATE_FORMAT.format(before36Hours/*.getTime()*/));
		System.out.println("=============================================================");
		for (Date date : dateItems) {
			System.out.println(DATE_FORMAT.format(date)/*+", ms="+date.getTime()*/+", max 36 hodin o nyní?:"+ ((date.after(before36Hours))?"ANO":"NE"));
			if (date.before(before36Hours)) {
				System.out.println("   vyřadit...");
				
			}
		}
		
		System.out.println("*********************************************");
		System.out.println(dateItems);
		
		

	}

}
