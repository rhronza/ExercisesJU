package mainpackage;

public class StringRhr2 {

	public StringRhr2() {

		/* contains */

		String s1 = "Rauch ";
		String s2 = "Rauch Happy Day Pomeranč 100% 1l";
		String s3 = "Happy Day Jablko-bezový květ 100% 1l Rauch";
		System.out.println("1:" + s2.contains(s1) + ", bez:" + s2.replace(s1, "").trim() + ", poslední slovo=" + s2.substring(s2.lastIndexOf(" ") + 1));
		System.out.println("2:" + s3.contains(s1) + ", bez:" + s3.replace(s1, "").trim() + ", poslední slovo=" + s3.substring(s3.lastIndexOf(" ") + 1));

		// String test = "This is a sentence";
		String test = "aa 6";
		String lastWord = test.substring(test.lastIndexOf(" ") + 1);
		System.out.println(lastWord + "\n");

		String sentence = "Check this answer and you can find the keyword with this codes";
		String search = "keyword";

		if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {

			System.out.println("I found the keyword");

		} else {

			System.out.println("not found");

		}

		lastWord = sentence.replaceAll("^.*?(\\w+)\\W*$", "$1");
		System.out.println(lastWord + "\n");
		System.out.println("---------------------------------------------------------------------------");

		s2 = "Happy Day Pomeranč 100% 1l Rauch";
		String brand = "raUch";
		String modifyName = s2.toLowerCase();
		brand = brand.toLowerCase();
		int sp, lngth = 0;
		sp = modifyName.indexOf(brand);
		lngth = brand.length();
		if (sp>0 && (sp+lngth < modifyName.length())) {
			lngth++;
		}
		String modifyName2 = (modifyName.substring(0, sp)+ modifyName.substring(sp + lngth)).trim();

		
		System.out.println(s2);
		System.out.println(brand);
		System.out.println(sp);
		System.out.println(lngth);
		System.out.println("modify="+modifyName2+".");

	}

}
