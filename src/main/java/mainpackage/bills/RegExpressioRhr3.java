package mainpackage.bills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressioRhr3 {

	public RegExpressioRhr3() {
//		Pattern  p = Pattern.compile("\\sB\\s(B|C)\\s(.*?)");
		Pattern  p = Pattern.compile("RT(.*?)");
		Pattern pattern = Pattern.compile("55(.*?)66", Pattern.DOTALL);
		// Pattern pattern = Pattern.compile("55(.|\\s)66");
		String input = "JOGURT BÍLÝ B 14.90";
		Matcher m = p.matcher(input);
		if (m.find()) {
			String s = m.group(1);
			System.out.println(s);
			System.out.println(m.start());
			System.out.println(m.start());
			
		}
		
	}

}
