package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Produkt {

	public Produkt() {
		List<String> seznam = new ArrayList<String>();
		seznam.add("Neutrogena Tělové mléko pro suchou pokožku 400ml");
		seznam.add("Muumi Baby Jednorázové dětské bio pleny Maxi+ S5 10-16kg/22ks");
		seznam.add("Beemy zavinovačka LIGHT STARS GREY warm"); // 1ks
		seznam.add("Beemy bryndáček/slintáček 2 ks Baby pink-purple");
		seznam.add("Vinný Dům Alibernet 2015 výběr z hroznů 0,75 l");
		seznam.add("Beemy froté osuška 100x100cm PEPE"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		seznam.add("Coca - cola sklo 24 x 11ml");
		seznam.add("Coca - cola sklo 24x200ml");
		seznam.add("Olma Revital jogurt angrešt s konopnými semínky 1,7% 145g");
		seznam.add("Catsan Hygienické stelivo 10l");
		seznam.add("Toro Houbička na nádobí kulatá „Smajlík” 79 x 30mm, 6ks");
		seznam.add("Maso Brejcha Vepřová krkovice bez kosti plátek (cca 600g)");
		seznam.add("Maso Brejcha Vepřová krkovice bez kosti plátek (600g)");
		seznam.add("Freche Freunde Ovocné tyčinky jablko a mrkev 4ks");
		seznam.add("Beemy froté osuška 100x100cm PEPE");
		seznam.add("Lounský mošt jablko čiré 100%, BIB 5l");
		seznam.add("Název:Lounský mošt jablko/červená řepa 80/20% 250ml"); // určil 250litrůbalení 250l
		seznam.add("Vittel, přírodní minerální voda neperlivá, PET 0,75l");
		seznam.add("Whiskas Kapsička Casserole drůbeží výběr v želé 12x85g");
		seznam.add("kokos");

		String velikostBaleniString = "";
		Float velikostBaleniFloat = 0f;
		String[] poleStringu;

		for (String s : seznam) {
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(s);
			if (!matcher.find()) { /* neobsahuje čísla */
				System.out.println("1:" + s + ":" + "1 (neobsahuje čísla)");
			} else {
				pattern = Pattern.compile("(\\D\\d(ks|ml|l|g|kg|mg))");
				matcher = pattern.matcher(s);
				if (matcher.find()) {
					velikostBaleniString = matcher.group(1).replaceAll("[\\D]", "");
					velikostBaleniFloat = Float.parseFloat(velikostBaleniString);
					System.out.println("9:" + s + ":" + velikostBaleniFloat + ", ");
				} else {
					pattern = Pattern.compile("(\\d+\\sx\\s\\d+)");
					matcher = pattern.matcher(s);
					if (matcher.find()) { /* obsahuje "číslo x číslo" */
						velikostBaleniString = matcher.group(1);
						poleStringu = velikostBaleniString.split(" ");
						velikostBaleniFloat = Float.parseFloat(poleStringu[0]) * Float.parseFloat(poleStringu[2]);
						System.out.println("A:" + s + ":" + velikostBaleniFloat + ", " + velikostBaleniString);
					} else {
						pattern = Pattern.compile("(\\d+x\\d+)+");
						matcher = pattern.matcher(s);
						if (matcher.find()) { /* obsahuje "čísloxčíslo" */
							velikostBaleniString = matcher.group(0);
							poleStringu = velikostBaleniString.split("x");
							velikostBaleniFloat = Float.parseFloat(poleStringu[0]) * Float.parseFloat(poleStringu[1]);
							System.out.println("B:" + s + ":" + velikostBaleniFloat + ", ");
						} else { /* vezmi poslední slovo, odstraň jednotky a závorky a převeď na Float */
							velikostBaleniString = s.substring(s.lastIndexOf(" ")).replaceAll("['ml''g''kg''l''ks'()]", "").replaceAll("[,]", ".");
							try {
								velikostBaleniFloat = Float.parseFloat(velikostBaleniString);
								System.out.println("Z:" + s + ": " + velikostBaleniFloat.toString() + ", " + velikostBaleniString);
							} catch (Exception pe) {
								System.out.println("!!!!  Problém s vypočtem velikosti balenní :" + s);
							}
						}
					}
				}
			}
			String[] poleSlov = s.split(" ");
//			System.out.println("\n"+s);
			for (int i = 0; i < poleSlov.length; i++) {
				System.out.println(poleSlov[i]);
			}
			System.out.println("\n");
		}

	}
}
