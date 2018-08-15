package mainpackage2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlevaOff {

	public SlevaOff() {
		List<String> products = new ArrayList<>();

		products.add("Krajanka čerstvé mléko 1,5% 500ml-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Thornbridge Chiron 12 0,33l-SLEVA (Datum minimální trvanlivosti:5 červenec 2018)");
		products.add("Maso Klouda Vyzrálý Hovězí nízký roštěnec striploin (cca300g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Jehněčí plec BK (cca500g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Losos filet s kůží (cca1,5kg)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Schweppes Orange 1,5l-SLEVA ((Datum minimální trvanlivosti:8.červenec 2018)");
		products.add("Jelení kostky na guláš (cca500g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Zorba smetanový jogurt černý rybíz 150g-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Olma Revital Jogurt višeň-chia semínko 145g-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Jehněčí mleté maso (cca500g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Activia müsli/lískový ořech 125g-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Pickwick Fruit Fusion Variace ovoce s borůvkou (20 sáčků) 40g-SLEVA poškozený obal");
		products.add("Vlk mořský kuchaný (cca250g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Disney Hledá se Dory Dětský nealko.nápoj jablko 0,75l-SLEVA (Datum minimální trvanlivosti:27června");
		products.add("Vodňanské Kuře Zlaté kuře stehna (cca500g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Tuňák sashimi filet (cca240g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Sunar Premium 1, 21,5g-SLEVA (Datum minimální trvanlivosti:28června2018)");
		products.add("YO Ovocný sirup Černý rybíz 0,7l-SLEVA (Datum minimální trvanlivosti:23června2018)");
		products.add("Kapří stripsy marinované s obalovací směsí (cca250g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Ehrmann Pacholík Jogurt do ruky čokoládový 90g-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Šmakoun Karbanátky (cca300g)-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Zorba smetanový jogurt med a oříšky 150g-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Lisovaná anglická slanina (cca2,5kg)-SLEVA (spotřebujte do 05.07.2018)");
		products.add("Olz mini croissanty máslové 250g-SLEVA (Datum minimální trvanlivosti:12červenec 2018)");
		products.add("Hovězí plec z mladého býčka (cca600g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Olma Florian Smetanové pokušení jogurt višeň 150g-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Kiddylicious Křupky borůvkové 10g-SLEVA (Datum minimální trvanlivosti:26 června 2018)");
		products.add("Bohušovická mlékárna Skyr 0,1% tradiční islandský 140g-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Kančí kostky na guláš (cca500g)-SLEVA (spotřebujte do 04.07.2018)");
		products.add("Isoline Carnitine Drink grapefruit 0,75l-SLEVA (Datum minimální trvanlivosti:11červenec2018)");
		
//		Pattern p = Pattern.compile("(.*?)-SLEVA\\s");
		Pattern p = Pattern.compile("(.*?)-\\s*SLEVA\\s*");
		for (String nameProduct : products) {
			System.out.println("před: "+nameProduct);
			Matcher m = p.matcher(nameProduct);
			if (m.find()) {
				System.out.println("po  : "+m.group(1));
			} else {
				System.out.println("po  : " + "NENALEZEN");
			}
			
		}
	}

}
