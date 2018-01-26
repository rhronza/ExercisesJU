package mainpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class StringRhr {
	
	public StringRhr() {
		String s1 = "ABCD\"E";
		String s2 = "ABCDEF";
		
		System.out.println(s1+" delka: "+s1.length());
		System.out.println(s2+" delka: "+s2.length());
		System.out.println(" ----------------------------------------------------------------------------");
		
		String sRow="asdf7897987"+"                   data-product-price=\"9.9\"";
		
		/* rozlišující řetezec - levý */
		String distinctiveStringLeft="data-product-price=\"";
		
		/* rozlišující řetezec - pravý */
		String distinctiveStringRight="\"";
		
		String sPrice = "";
		
		/* vyextrahovat data postupně */
		/*
		sPrice = sRow.substring(sRow.indexOf(distinctiveStringLeft)+distinctiveStringLeft.length());
		sPrice = sPrice.substring(0, sPrice.lastIndexOf(distinctiveStringRight));
		*/
		
		/* a nebo to udělat rovnou celé */
		System.out.println(sRow.indexOf(distinctiveStringLeft));
		System.out.println(distinctiveStringLeft.length());
		System.out.println(sRow.lastIndexOf(distinctiveStringRight));
		
		sPrice = sRow.substring(sRow.indexOf(distinctiveStringLeft)+distinctiveStringLeft.length(),sRow.lastIndexOf(distinctiveStringRight));
		
		sPrice = sPrice.replace(",", ".");
		
		Float fPrice = Float.valueOf(sPrice);
		System.out.println("SPrice:"+sPrice);
		System.out.println("FPrice:"+fPrice);
		System.out.println(" ----------------------------------------------------------------------------");
		
		String s4 = "Ahoj jak se máš? Ahoj.";
		System.out.println("s4:"+s4);
		System.out.println("indexOf (jak):"+s4.indexOf("jak"));
		System.out.println("indexOf (Ahoj999) - neobsahuje:"+s4.indexOf("Ahoj999"));
		System.out.println("lastIndexOf (Ahoj):"+ s4.lastIndexOf("Ahoj"));
		System.out.println("lastIndexOf (Ahoj999)- neobsahuje:"+s4.lastIndexOf("Ahoj999"));
		System.out.println(" ----------------------------------------------------------------------------");
		
		System.out.println("."+String.join("", Collections.nCopies(5, " "))+".");
		List<String> s5 = Collections.nCopies(5, "*");
		System.out.println("s5:"+s5);
		
		String s6 = String.join("-", "a","b","c");
		System.out.println("s6:"+s6);
		
		List<String> s7 = new ArrayList<String>();
		s7.add("Ahoj");
		s7.add("jak");
		s7.add("se");
		s7.add("máš");
		s7.add("Čau");
		s7.add("!");
		String s8 = String.join("_", s7);
		System.out.println("s8 (join List): "+s8);
		System.out.println(" ----------------------------------------------------------------------------");
		
		String s111 = "https://www.kosik.cz/uzeniny-a-lahudky";
		String s112 = "https://www.kosik.cz/";
		System.out.println(s111.substring(s111.lastIndexOf("/")+1));
		System.out.println(s112.length()+", "+s112.lastIndexOf("/")+", "+s112.substring(s112.lastIndexOf("/")));
		System.out.println(s112.charAt(3));
		System.out.println("********************************************************");
		String s = null;
		System.out.println("Je null?:"+(s==null?"ANO":"NE"));
		System.out.println("********************************************************");
		String uriLink ="https://www.kosik.cz/mlecne-a-chlazene/AAAA/flsfjl-shdjgas";
		//String uriLink ="https://www.kosik.cz";
		String fileName = String.format("txt/%05d", 9998 )+uriLink.replaceAll("https://www.kosik.cz", "").replaceAll("[/.]", "_"); 
		System.out.println("Jmeno souboru: "+fileName);
		System.out.println("********************************************************");
		String a = "1";
		a = a + "2";
		System.out.println(a+", "+a.isEmpty());
		a="   ".trim();
		System.out.println(a.isEmpty());
		System.out.println("********************************************************");
		String cena = "29,80 Kč / ml ";
		String[] pole = cena.replaceAll(" ", "").replaceAll(",", ".").split("Kč/");
		for (String ss: pole) {
			System.out.println(ss);
		}
		System.out.println(pole[0]);
		System.out.println(pole[1]);
		System.out.println(pole);
		
		
		
		
		
		
	}	

}

