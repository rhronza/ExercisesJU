package mainpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* třída pro práci s textovým souborem2 */

public class ReadWriteTextFile {

	public ReadWriteTextFile() {
		System.out.println("Spustil se kontruktor");
	}
	
	/* přepisuje novým souborem */
	public static void newTextToTextFile() {
	
	try 
	{
		    BufferedWriter bw = new BufferedWriter(new FileWriter("txt/soubor.txt"));
	        Date datumCas = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	        bw.write(sdf.format(datumCas)+": "+"ZAČÁTEK BĚHU PROGRAMU");
	        bw.newLine();
	        bw.flush();
	        bw.close();
	}
	catch (Exception e)
	{
	        System.err.println("Do souboru se nepovedlo vytvořit.");
	};
	}
	
	/* přidává do souboru */
	public static void addTextToTextFile() {
	try 
	{
			BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true));
			Date datumCas = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	        bw.write(sdf.format(datumCas)+": "+"UDÁLOST 654654654654");
	        bw.newLine();
	        bw.flush();
	        bw.close();
	}
	catch (Exception e)
	{
	        System.err.println("Do souboru se nepovedlo zapsat.");
	}
	}
	
	
	
	/* čte se souboru */
	public static void readTextFile() {
	try 
	{
			BufferedReader br = new BufferedReader(new FileReader("txt/soubor.txt"));
	        String s;
	        while ((s = br.readLine()) != null)
	        {
	                System.out.println(s);
	        }
	        br.close();
	}
	catch (Exception e)
	{
	        System.err.println("Chyba při čtení ze souboru.");
	}
	}
	

}
