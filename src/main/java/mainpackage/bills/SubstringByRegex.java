package mainpackage.bills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringByRegex {

	public SubstringByRegex() {
		firstExtract();
		// billaExtract();
	}

	private void firstExtract() {
		/* od 55 do 66 */
		System.out.println("");
		System.out.println("první:");
		String mydata = "some 55 string with \r\n 'the 66data i want' inside";
		Pattern pattern = Pattern.compile("55(.*?)66", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(mydata);
		if (matcher.find()) {
			System.out.println(matcher.group(1));
		}

		/* mezi dvěma mezerami */
		System.out.println("");
		System.out.println("druhý:");
		String mydata2 = "some 999 string with 'the 66data i want' inside";
		Pattern pattern2 = Pattern.compile("\\s(.*?)\\s(.*?)\\s");
		Matcher matcher2 = pattern2.matcher(mydata2);
		if (matcher2.find()) {
			System.out.println(mydata2);
			System.out.println(matcher2.group(1));
			System.out.println(matcher2.group(2));
		}

		/* od začátku do 66 */
		System.out.println("");
		System.out.println("třetí:");
		String mydata3 = "some 999 string with 'the 66data i want' inside";
		Pattern pattern3 = Pattern.compile("(.*?)66");
		Matcher matcher3 = pattern3.matcher(mydata2);
		if (matcher3.find()) {
			System.out.println(matcher3.group(1));
		}

		/* od 66 do konce */
		System.out.println("");
		System.out.println("čtvrtý:");
		String mydata4 = "some 999 string with 'the 66data i want' inside8 "; //
		Pattern pattern4 = Pattern.compile("66(.*?)$");
		Matcher matcher4 = pattern4.matcher(mydata4);
		if (matcher4.find()) {
			System.out.println(matcher4.group(1));
		}

		/* POKUS HOKUS */
		System.out.println("");
		System.out.println("hokus pokus2:");
		System.out.println("===========");

		String paternStringNameProduct = "(.*?)\\s[BC]\\s+-?\\d+\\.\\d{2}$";
		String paternStringPrice = "\\s+(-?\\d+\\.\\d{2}$)";
		Pattern patternNameProduct = Pattern.compile(paternStringNameProduct);
		Pattern patternPrice = Pattern.compile(paternStringPrice);

		// String receiptRow = "JOGURT bíly borůvkový B -124.92"; //
		String receiptRow = "fff C -124.92"; //

		System.out.println("input  =" + receiptRow);
		Matcher matcherNameProduct = patternNameProduct.matcher(receiptRow);
		Matcher matcherPrice = patternPrice.matcher(receiptRow);
		if (matcherNameProduct.find() && matcherPrice.find()) {
			System.out.println("Product =\"" + matcherNameProduct.group(1) + "\"");
			System.out.println("Regex   =\"" + matcherNameProduct.pattern() + "\"");
			System.out.println("Price   =\"" + matcherPrice.group(1) + "\"");
			System.out.println("Regex   =\"" + matcherPrice.pattern() + "\"");
		}

		/* od adresa obchodu */
		System.out.println("");
		System.out.println("adresa obchodu:");
		String input = "ALBERT 604\r\n" + "Sídlo plátce dané :\r\n" + "Radlická 520/117 158 00 Praha 5-Jinonice \r\n" + "DIC : CZ44012373 ICO : 44012373 ";
		Pattern patternShop = Pattern.compile("S.dlo pl.tce dan.\\s:(.*?)DIC\\s:\\sCZ", Pattern.DOTALL);
		Matcher matcherShop = patternShop.matcher(input);
		if (matcherShop.find()) {
			System.out.println(matcherShop.group(1));
		}
	}

	private void billaExtract() {
		System.out.println("billaExtract");
		String mydata4 = "15:21:52.315 [main] INFO org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB - To get higher rendering speed on JDK8 or later,\r\n"
				+ "15:21:52.323 [main] INFO org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB -   use the option -Dsun.java2d.cmm=sun.java2d.cmm.kcms.KcmsServiceProvider\r\n"
				+ "15:21:52.323 [main] INFO org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB -   or call System.setProperty(\"sun.java2d.cmm\", \"sun.java2d.cmm.kcms.KcmsServiceProvider\")\r\n"
				+ "15:21:52.701 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font ArialMT\r\n"
				+ "15:21:52.728 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font Arial-ItalicMT\r\n"
				+ "15:21:52.736 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font TimesNewRomanPSMT\r\n"
				+ "15:21:52.756 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font Arial-BoldMT\r\n"
				+ "15:21:52.791 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font ArialMT\r\n"
				+ "15:21:52.799 [main] DEBUG org.apache.fontbox.ttf.PostScriptTable - No PostScript name information is provided for the font TimesNewRomanPSMT\r\n" + "•.;•/, •• ,jv< fj /\r\n" + "?'■'* 7'^'' ^\r\n" + "^ ' v ■\r\n"
				+ "MA-V'\r\n" + "' ' ' ' 'i • i*; ' -\r\n" + "?' j/-5íc5.5||^\r\n" + ".L . k f . y i\r\n" + "'-sr\r\n" + "í\r\n" + "O.V/ÍF\r\n" + "BILLA, SPOL. S R.O., MODLETICE tl\r\n" + "251 01 ŘÍČANY U PRAHY \r\n"
				+ "FIL. PRAHA FÉNIX \r\n" + "DIČ: CZ00685976 \r\n" + "Ič: 00685976 \r\n" + "WWW.BILLA.cz\r\n" + "Datum: 17.07.2018 Čas: 11:55:23\r\n" + "JOGURT BÍLÝ B 14.90\r\n" + "JOGURT BÍLÝ B 14,90\r\n" + "CORNY BIG B 17.90\r\n"
				+ "CORNY BIG B 17.90\r\n" + "ORBIT B 13.90\r\n" + "Celkem CZK 79.50\r\n" + "««k mm mm m mm mm mm mm mm- mm a** mmm mm •m* *m mm mm mm mm •*«• mm mm ^m- mm  ̂rmm «■*> **•\r\n"
				+ "mm mm ^ mm mm «v mm mm mm mm mmmm^rn mm \"m m» mm mm mm Bí mm mm mm éjm «•» \"m^ mm mm mm mm\r\n" + "PŘIJATO plateb.karta 79.50\r\n"
				+ "mm mm ttm mm *m «m 0m mm m^ mm ^ hm mm mm mmm amm «« mm mm mm mm mm mm ^ ^ tm tm ^ mm\r\n" + "ID provozovny: 111 ID pokladny: 4 \r\n" + "Pořadové číslo dokladu; 6341/4/119 \r\n" + "DIČ: CZ00685976\r\n"
				+ "Režim: běžný\r\n" + "FIK: 0fb9802a-41bd-43a5-89e8-02a7fbcf1\r\n" + "ad9-03\r\n" + "BKP: AD3B0F87-240EFCCA-AC7BCD3A-23676B\r\n" + "08-79288545\r\n" + "BILLA, SPOL. S R.O.\r\n" + "17,07.2018 11:55:37\r\n"
				+ "019308 / 177 / 00 \r\n" + "STVRZENKA PRO ZAKAZNÍKA \r\n" + "Terminál: 892573 \r\n" + "(892573/892573/L73)\r\n" + "Visa Contactless\r\n" + "Karta: VISA\r\n" + "xxxx xxxx xxxx 7296\r\n" + "AID: A0000000031010\r\n"
				+ "Visa\r\n" + "Prodej\r\n" + "A?ástka: CZK 79,50\r\n" + "Autor1zaA?ni kód: 763698\r\n" + "Děkujeme za Váš nákup i \r\n" + "B : 15X DPH z\r\n" + "69.13 = 10.37\r\n" + "VYUŽIJTE VÝHODNÉ NABÍDKY \r\n"
				+ "BILLA BONUS CLUBU!\r\n" + "Filiálka: 00119 POKLADNA 4 O.dokl \r\n" + "Pos 5 Jméno pok.; POKLADNÍ: 17\r\n" + "EV-Č: 0119-20180717-04-6341\r\n" + "";

		Pattern pattern = Pattern.compile("Čas:\\s\\d\\d:\\d\\d:\\d\\d(.*?)Celkem", Pattern.DOTALL);
		Matcher m = pattern.matcher(mydata4);

		Pattern patternRow = Pattern.compile("");
		if (m.find()) {
			String rowsString = m.group(1);
			List<String> rows = new ArrayList<>(Arrays.asList(rowsString.split("\\r?\\n")));
			System.out.println("");
			System.out.println("řetěz:");
			System.out.println(rowsString);
			System.out.println("");
			System.out.println("seznam:");

			String rowPaternString = "(.*?)\\s[BC]\\s+-?\\d+\\.\\d{2}$";
			/*
			 * popis regex: hledám skupinu kde můžou být znaky všechny: ((.*?) pak právě jedna mezera: \\s pak B nebo C: [BC] mezera 1..N krát: \\s+ pak znaménko minus: 0..1 krát: -? pak desetinná číslice 1..N krát: \\d+ pak tečka: \\. pak
			 * právě 2 číslice: \\d{2} a to vše na konci: $
			 */

			Pattern pNameProduct = Pattern.compile(rowPaternString);
			Matcher mNameProduct;

			for (int i = 0; i < rows.size(); i++) {
				String row = rows.get(i);
				mNameProduct = pNameProduct.matcher(row);
				if (mNameProduct.find()) {
					String priceString = row.substring(row.lastIndexOf(" ") + 1).replace(",", ".");
					Float price = Float.parseFloat(priceString);
					Float priceMultiplied = price * 1.1f;
					System.out.println(i + " název produktu:" + mNameProduct.group(1) + ",  cena:" + price + ", cena x 1,1 = " + priceMultiplied);
				}

			}

		}
	}
}
