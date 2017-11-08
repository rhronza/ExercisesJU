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
		//cal.clear(); // nastaví datum na 1.1.1970
		
		DateFormat dateFormat1 = new SimpleDateFormat("d.MMMM.yyyy HH:mm:ss");
		DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		/* nastavení dne týdne do formátu datumu:*/
		DateFormat dateFormat3 = new SimpleDateFormat("EEE dd.MM.yyyy HH:mm:ss");
		DateFormat dateFormat4 = new SimpleDateFormat("EEE dd.MM.yyyy");
		
		System.out.println(cal.getTime());
		System.out.println("\nCalendar1: "+dateFormat1.format(cal.getTime()));
		System.out.println("Calendar2: "+dateFormat2.format(cal.getTime()));
		System.out.println("Calendar3: "+dateFormat3.format(cal.getTime()));

		cal.add(Calendar.MONTH,+1);
		cal.add(Calendar.DAY_OF_MONTH,-1); 
		System.out.println("Calendar3 Add: "+dateFormat3.format(cal.getTime()));
		System.out.println("Calendar3 Add without format: "+cal.getTime());
		
				
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2017, Calendar.APRIL, 30);
		System.out.println("\nCal2: "+dateFormat3.format(cal2.getTime()));
		
		/* iterace od datumu do datumu */
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		startDate.set(2017, Calendar.JANUARY, 1);
		endDate.set(2017, Calendar.DECEMBER, 31);
		
		System.out.println("\nstart: "+dateFormat4.format(startDate.getTime()));
		System.out.println("start without format: "+startDate.getTime());
		for (Date dateIterated = startDate.getTime(); startDate.before(endDate); startDate.add(Calendar.DATE, 1)/*, dateIterated=startDate.getTime()*/) {
			/* první den měsíce: */
			/*
			if (startDate.get(Calendar.DAY_OF_MONTH)==1) {
				System.out.println("První den měsíce: "+dateFormat4.format(startDate.getTime())); 
			}
			*/
			
			/* čtvrtky: */
			if (startDate.get(Calendar.DAY_OF_WEEK)==5) {
				System.out.println("Čtvrtek: "+dateFormat4.format(startDate.getTime())); 
			}
			int aktualniMesic = startDate.get(Calendar.MONTH);
			
			
		}
		
		System.out.println("konec: "+dateFormat4.format(endDate.getTime()));
		
		
		
		
		
		
		/* počet milisekund od 1.1.1970 */
		long pocetMiliSekundDoTed = new Date().getTime(); 
		System.out.println("\nPočet vteřin: "+pocetMiliSekundDoTed);
		
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

