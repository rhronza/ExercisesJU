package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class RegularExpressions {

	public RegularExpressions() { 
		this.hlavni();
	}

	public void hlavni() {
		
		List<String> list= new ArrayList<String>(); // LinkedList, Vector ??
		List<String> listBezTextu= new ArrayList<String>(); 
	
		list.add("text1řčžýřýžř");
		list.add("xtext2");
		list.add("text3");
		list.add("xtext4");
		list.add("textř5");
		list.add("xtext6");
		list.add("text7");
		list.add("xtext8");
		
		System.out.println("Původní seznam:");
		for(String s: list) {
			System.out.println(s);
		}
		
		
		/* následující iterace nahradí znaky z regulárního výrazu prázdnými znaky,
		 * tj. vypustí textové znaky
		 * */
		for (String s: list) {
			String s1 = s.replaceAll("[a-zA-Zěščřžýáíéó]", "");
			listBezTextu.add(s1);
		}
		
		System.out.println("Nový seznam:");
		for(String s: listBezTextu) {
			System.out.println(s);
		}
		
	}
}
