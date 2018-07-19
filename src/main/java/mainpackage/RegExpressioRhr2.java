package mainpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressioRhr2 {

	public RegExpressioRhr2() {
		System.out.println("********************************************************");
		String regex = "[0-9]+";
		String data = "23343453";
		System.out.println(data+": "+data.matches(regex));
		System.out.println("********************************************************");
//		String inputString="Coca - cola Zero sklo  24 x 200ml)";
		String inputString="Toro Houbička na nádobí kulatá „Smajlík” 79 x 30mm, 6ks";
		String regExpr = "(\\sx\\s)";
		System.out.println(inputString+":"+inputString.matches(regExpr));
//		String regExpr2 = "(\\d)(\\s)x(\\s)(\\d)w+";
		String regExpr2 = "(\\d\\sx\\s\\d)+";
		String regExpr3 = "(\\dx\\d)+";
		Pattern p2 = Pattern.compile(regExpr2);
		Pattern p3 = Pattern.compile(regExpr3);
		Matcher m2 = p2.matcher(inputString);
		Matcher m3 = p3.matcher(inputString);
		System.out.println("matches2 "+m2.pattern()+":" +m2.find());
		System.out.println("matches3 "+m3.pattern()+": "+m3.find());
//		System.out.println("matches2: "+s222.matches(regExpr2));
		
	
	}
	
}
