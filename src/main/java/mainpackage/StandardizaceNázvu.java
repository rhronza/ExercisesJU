package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardizaceNázvu {

	// cilem je standardizovat název podle Funkčního designu

	public StandardizaceNázvu() {
		List<String> seznam = new ArrayList<String>();
		seznam.add("Neutrogena Tělové mléko pro suchou pokožku 400ml");
		seznam.add("Muumi Baby Jednorázové dětské bio pleny Maxi+ S5 10-16kg/22ks");
		seznam.add("Muumi Baby Jednorázové dětské bio pleny Maxi+ S5 10 - 16kg / 22ks");
		seznam.add("Beemy zavinovačka LIGHT STARS GREY warm"); // 1ks
		seznam.add("Beemy bryndáček/slintáček 2 ks Baby pink-purple");
		seznam.add("Vinný Dům Alibernet 2015 výběr z hroznů 0,75 l xx");
		seznam.add("Beemy froté osuška 100 x 100cm PEPE"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		seznam.add("Coca - cola sklo 24 x 11ml");
		seznam.add("Coca - cola sklo 1,75 l bbb");
		seznam.add("Coca - cola sklo 24x200ml");
		seznam.add("Olma Revital jogurt angrešt s konopnými semínky 1,7% 145g");
		seznam.add("Catsan Hygienické stelivo 10l");
		seznam.add("Toro Houbička na nádobí kulatá „Smajlík” 79 x 30mm, 6ks");
		seznam.add("Maso Brejcha Vepřová krkovice bez kosti plátek ( cca 600g)");
		seznam.add("Maso Brejcha list Vepřová krkovice bez kosti plátek ( cca600g)");
		seznam.add("Maso Brejcha list Vepřová krkovice bez kosti plátek (cca600g )");
		seznam.add("Maso Brejcha list Vepřová krkovice bez kosti plátek ( cca 600g )");
		seznam.add("Maso Brejcha Vepřová krkovice bez kosti plátek (600g )");
		seznam.add("Freche Freunde Ovocné tyčinky jablko a mrkev 4ks");
		seznam.add("Beemy froté osuška 100x100cm PEPE");
		seznam.add("Lounský mošt jablko čiré 100%, BIB 5l 120 g 800 kg 300 l 400 ml");
		seznam.add("Název:Lounský mošt jablko/červená řepa 80/20% 250ml"); // určil 250litrůbalení 250l
		seznam.add("Vittel, přírodní minerální voda neperlivá, PET 0,75l");
		seznam.add("Whiskas Kapsička Casserole drůbeží výběr v želé 12 * 85g");
		seznam.add("Bella Baby Happy Dětské 8 ks hygienické podložky 90x60cm 5 ks");
		seznam.add("ko kos");

		String aktualizovanyString = "";
		// Float velikostBaleniFloat = 0f;
		// String[] poleStringu;

		for (String s : seznam) {
			aktualizovanyString = s.replaceAll("(\\sx\\s)", "x");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\s\\*\\s)", "*");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\s\\-\\s)", "-");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\s\\/\\s)", "/");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\s\\))", ")");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\(\\s)", "(");
			aktualizovanyString = aktualizovanyString.replaceAll("(\\(cca\\s)", "(cca");
			List <String> listUnits = new ArrayList<String>();
			listUnits.add("l");
			listUnits.add("ml");
			listUnits.add("kg");
			listUnits.add("g");
			listUnits.add("ks");
			for (String su: listUnits) {
				aktualizovanyString = aktualizovanyString.replaceAll("(\\s"+su+"\\s)", su+" ");
				aktualizovanyString = aktualizovanyString.replaceAll("(\\s"+su+"$)", su); //na konci slova
			}
					System.out.println(s + " -> " + aktualizovanyString);
		}
	}
}
