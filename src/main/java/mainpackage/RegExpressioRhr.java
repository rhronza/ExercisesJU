package mainpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressioRhr {

	public RegExpressioRhr() {
		System.out.println("********************************************************");
		String regex = "[0-9]+";
		String data = "23343453";
		System.out.println(data.matches(regex));
		System.out.println("********************************************************");
//		String s222="Coca - cola Zero sklo  24 x 200ml)";
		String s222="Toro Houbička na nádobí kulatá „Smajlík” 79x30mm, 6ks";
		String regExpr = "[0-9a-zA-Z\\s\\-()]+";
		System.out.println("matches: "+s222.matches(regExpr));
//		String regExpr2 = "(\\d)(\\s)x(\\s)(\\d)w+";
		String regExpr2 = "(\\d\\sx\\s\\d)+";
		String regExpr3 = "(\\dx\\d)+";
		Pattern p2 = Pattern.compile(regExpr2);
		Pattern p3 = Pattern.compile(regExpr3);
		Matcher m2 = p2.matcher(s222);
		Matcher m3 = p3.matcher(s222);
		System.out.println("matches2: "+m2.find());
		System.out.println("matches3: "+m3.find());
//		System.out.println("matches2: "+s222.matches(regExpr2));
		
		if (s222.contains(" x ")) {
			System.out.println("obsahuje");
		} else System.out.println("NEOBSAHUJE");
		
		System.out.println(s222);
		String lastWord = s222.substring(s222.lastIndexOf(" ")+1);
		System.out.println(lastWord.replaceAll("[()]", ""));
		Pattern p2222 = Pattern.compile("[0-9' 'x'  '0-9]");
		//Pattern p = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}");
		System.out.println("********************************************************");
		String s333 = "1 33   3,28 čK";
		String s444 = s333.replaceAll("[Kč' ']", "").replace(',', '.');
		System.out.println("s444:|"+s444+"|");
		float cislo = Float.parseFloat(s444);
		System.out.println(cislo);
		System.out.println("------------------------------------------\nend\n");
		
		

	
	}
	
}
