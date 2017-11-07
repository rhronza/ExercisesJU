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
		DateFormat dateFormat1 = new SimpleDateFormat("d.MMMM.yyyy HH:MM:SS");
		System.out.println("Calendar1: "+dateFormat1.format(cal.getTime()));
		DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy HH:MM:SS");
		System.out.println("Calendar2: "+dateFormat2.format(cal.getTime()));
		cal.add(Calendar.MONTH,+1);
		cal.add(Calendar.DAY_OF_MONTH,8);
		System.out.println("Calendar3: "+dateFormat1.format(cal.getTime()));
		
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.clear();
		
		
		/* počet milisekund od 1.1.1970 */
		long pocetMiliSekundDoTed = new Date().getTime(); 
		System.out.println("Počet vteřin: "+pocetMiliSekundDoTed);
		
		//long pocetMiliSekundKonecRoku = new Date(17,12,31); // zastaralé
		
		
		
		
		
		/* třídy LocalDate, LocalDateTime, LocalTime */
		LocalDateTime dateToday = LocalDateTime.now();
		LocalDate localDate = dateToday.toLocalDate();
		LocalTime localTime = dateToday.toLocalTime();
		System.out.println("Dnes:"+ dateToday);
		System.out.println("Dnešní datum: "+localDate);
		System.out.println("Aktuální čas: "+localTime);
		
		
	}
}

