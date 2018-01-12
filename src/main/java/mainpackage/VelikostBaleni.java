package mainpackage;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class VelikostBaleni {

	public VelikostBaleni() {
		List<String> seznam = new ArrayList<String>();
		seznam.add("Neutrogena Tělové mléko pro suchou pokožku 400ml");
		seznam.add("Muumi Baby Jednorázové dětské bio pleny Maxi+ S5 10-16kg/22ks");
		seznam.add("Beemy zavinovačka LIGHT STARS GREY warm");
		seznam.add("Beemy bryndáček/slintáček 2 ks Baby pink-purple");
		seznam.add("Vinný Dům Alibernet 2015 výběr z hroznů 0,75l");
		seznam.add("Beemy froté osuška 100x100cm PEPE");
		seznam.add("Coca-cola sklo 24 x 200ml");
		seznam.add("Olma Revital jogurt angrešt s konopnými semínky 1,7% 145g");
		seznam.add("Catsan Hygienické stelivo 10l");
		seznam.add("Toro Houbička na nádobí kulatá „Smajlík” 79x30mm, 6ks");
		
		String velikostBaleni="";
		Float velikostBaleniFloat = 0f;
		
		for (String s: seznam) {
			velikostBaleni=s.substring(s.lastIndexOf(" ")).replaceAll("['ml','g','kg','l','ks']","" ).replaceAll(",", ".");
			try {
				velikostBaleniFloat=Float.parseFloat(velikostBaleni);
				System.out.println(s+": "+velikostBaleniFloat.toString());
			} catch (Exception pe) {
				System.out.println("!!!!  Problém s vypočtem velikosti balenní :"+s);
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
