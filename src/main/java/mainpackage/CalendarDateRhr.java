package mainpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class CalendarDateRhr {
	
	public CalendarDateRhr() throws ParseException {
		
		
		/* ----------------------------------------------------------------- **/
		/*Inicializace kalendáře */ 
			Calendar calendarToday = Calendar.getInstance();
		/*Inicializace Date */
			Date dateToday = new Date();
			/* nebo rovnou inicializovat z Calendar: */
			//Date dateToday =calendarToday.getTime();
		/* převod z Calendar na Date - dělá se přes getTime()*/
			dateToday = calendarToday.getTime();
		/* převod z Date na Calendar - dělá se přes setTime() */
			calendarToday.setTime(dateToday);
		/* ----------------------------------------------------------------- **/
		
		/* inicializace instance statickou metodou: */ 
		Calendar cal = Calendar.getInstance();
		//cal.clear(); // nastaví datum na 1.1.1970
		cal.set(1964, Calendar.SEPTEMBER, 21, 8, 5, 11); // měsíc je o 1 snížený (den a rok nejsou) nebo použít konstantu
		//cal = {8/4/1911}; 
		//Calendar cal2 = {1911/4/1}; 
		
		//long countMiliSecond = 
		//Date dtm = new ;
		//dtm = {1911/4/1}; 
		
		DateFormat dateFormat1 = new SimpleDateFormat("d.MMMM.yyyy HH:mm:ss");
		DateFormat dateFormat1a = new SimpleDateFormat("EEE d.MMMM.yyyy HH:mm:ss");
		DateFormat dateFormat1b = new SimpleDateFormat("yyyy-MM-dd-HH'hodin'-mm'minut'-ss'sekund'");
		DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		
		/* nastavení dne týdne do formátu datumu:*/
		DateFormat dateFormat3 = new SimpleDateFormat("EEE dd.MM.yyyy HH:mm:ss");
		DateFormat dateFormat4 = new SimpleDateFormat("EEE dd.MM.yyyy");
		DateFormat dateFormat5 = new SimpleDateFormat();
		
		System.out.println("getTime()="+cal.getTime());
		System.out.println("\nCalendar1: "+dateFormat1.format(cal.getTime()));
		System.out.println("\nCalendar1a: "+dateFormat1a.format(cal.getTime()));
		System.out.println("\nCalendar1b: "+dateFormat1b.format(cal.getTime()));
		System.out.println("Calendar2: "+dateFormat2.format(cal.getTime()));
		System.out.println("Calendar3: "+dateFormat3.format(cal.getTime()));
		System.out.println("Calendar5: "+dateFormat5.format(cal.getTime()));

		cal.add(Calendar.MONTH,+1);
		cal.add(Calendar.DAY_OF_MONTH,-1); 
		System.out.println("Calendar3 Add: "+dateFormat3.format(cal.getTime()));
		System.out.println("Calendar3 Add without format: "+cal.getTime());
		
				
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2017, Calendar.APRIL, 30);
		System.out.println("\nCal2: "+dateFormat3.format(cal2.getTime()));
		
		/* *********************************************************************************************** */
		/* string to Calendar */
		String datumString = "31.12.2010";
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Date datumDate = sdf.parse(datumString) ;//new Date();
		datumDate = sdf.parse(datumString);
		
		Calendar datumCalendar = Calendar.getInstance(); 
		datumCalendar.setTime(datumDate);
		System.out.println("\nCalendar (from String): "+dateFormat1.format(datumCalendar.getTime()) );
		
		/* string to Date */
		String datumString2= "30.11.2000";
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date datum2 = df.parse(datumString2);
		System.out.println("Date (from String): "+df.format(datum2)+"\n");
		
		/* *********************************************************************************************** */
		/* iterace od datumu do datumu */
		/*nastavení datumu */
		Calendar startDate = Calendar.getInstance();
		startDate.set(2017, Calendar.JANUARY, 1);

		Calendar endDate = Calendar.getInstance(); 
		endDate.set(2017, Calendar.DECEMBER, 31);
		
		
		System.out.println("\n\nITERACE ode dne, do dne\nstart: "+dateFormat4.format(startDate.getTime()));
		System.out.println("start without format: "+startDate.getTime());
		for (/*Date dateIterated = startDate.getTime()*/; startDate.before(endDate); startDate.add(Calendar.DAY_OF_MONTH, 1)/*, dateIterated=startDate.getTime()*/) {
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
		
		System.out.println("konec: "+dateFormat4.format(endDate.getTime())+"\n");
		/* *********************************************************************************************** */	
		
		Date datum = new Date();
		System.out.println("\nDate="+datum);
		System.out.println("Date (dateFormat1) ="+dateFormat1.format(datum));
		System.out.println("Date (dateFormat2) ="+dateFormat2.format(datum));
		
		/* *********************************************************************************************** */		
		
		/* počet milisekund od 1.1.1970 */
		long pocetMiliSekundDoTed = new Date().getTime(); 
		System.out.println("\nPočet vteřin: "+pocetMiliSekundDoTed+"\n");
		
		//long pocetMiliSekundKonecRoku = new Date(17,12,31); // zastaralé
		
		/* třídy LocalDate, LocalDateTime, LocalTime */
		LocalDateTime localDateTimeToday = LocalDateTime.now();
		//LocalDate localDate = dateToday.toLocalDate();
		//LocalTime localTime = dateToday.toLocalTime();
		System.out.println("Dnes:"+ localDateTimeToday);
		System.out.println("Dnešní datum: "+localDateTimeToday.toLocalDate());
		System.out.println("Aktuální čas: "+localDateTimeToday.toLocalTime());
		localDateTimeToday = LocalDateTime.of(2015, 9, 21, 15, 0,23);
		System.out.println("Jiný datum je :"+ localDateTimeToday);
		localDateTimeToday = LocalDateTime.of(0, 1, 1, 0, 0,0);
		System.out.println("Jiný datum je :"+ localDateTimeToday);
		
		
	}
}

