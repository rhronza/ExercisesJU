package mainpackage;

import java.text.Normalizer;

public class Diacritic {
	
	public Diacritic() {
		String s1 = "Nestlé";
		String s2 = "Nestle";
		String s3 = "ě š č ř ž ý á í é ň ť ď ľ  Ě Š Č Ř Ž Ý Á Í É Ď Ť Ň ä ë ö ü Ä Ë Ö Ü";
		String s4 = "čokoláda říkala";
		
		
		System.out.println(stripAccents(s1));
		System.out.println(stripAccents(s2));
		System.out.println(stripAccents(s3));
		System.out.println(stripAccents(s4));
	}

	
	/* https://stackoverflow.com/questions/15190656/easy-way-to-remove-accents-from-a-unicode-string */
	public static String stripAccents(String s) 
	{
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}
}
