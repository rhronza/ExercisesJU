package mainpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class CalendarRhr {
	
	public CalendarRhr() {
		
		
		/* inicializace instance statickou metodou: */ 
		Calendar cal = Calendar.getInstance();
		cal.clear();
		System.out.println(cal);
		DateFormat dateFormat = new SimpleDateFormat("d.MMMM.yyyy HH:MM:SS");
		System.out.println("Calendar: "+dateFormat.format(cal.getTime()));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.clear();
		
		
		/* počet milisekund od 1.1.1970 */
		long pocetMiliSekundDoTed = new Date().getTime(); 
		System.out.println("Počet vteřin: "+pocetMiliSekundDoTed);
		
		//long pocetMiliSekundKonecRoku = new Date(17,12,31); // zastaralé
		long pocetMiliSekundKonecRoku = new setTime(1000000);
		
		
		
		
		
		/* třídy LocalDate, LocalDateTime, LocalTime */
		LocalDateTime dateToday = LocalDateTime.now();
		LocalDate localDate = dateToday.toLocalDate();
		LocalTime localTime = dateToday.toLocalTime();
		System.out.println("Dnes:"+ dateToday);
		System.out.println("Dnešní datum: "+localDate);
		System.out.println("Aktuální čas: "+localTime);
		
		
	}
}

