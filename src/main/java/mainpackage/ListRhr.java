package mainpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRhr {

	List<Object> listPoradi = new ArrayList<Object>();
	List<Object> listBarvy = new ArrayList<Object>();
	
	List<String> listPoradi2 =  new ArrayList<String>();
	List<String> listBarvy2 =  new ArrayList<String>();
	
	public ListRhr() {
		
		listPoradi.add(new Poradi("první"));
		listPoradi.add(new Poradi("druhý"));
		listPoradi.add(new Poradi("třetí"));
		listPoradi.add(new Poradi("čtvrtý"));
		listPoradi.add(new Poradi("pátý"));
		listBarvy.add(new Barva("bílá"));
		listBarvy.add(new Barva("červená"));
		listBarvy.add(new Barva("modrá"));
		listBarvy.add(new Barva("fialová"));
		listBarvy.add(new Barva("zelená"));
		listPoradi = listBarvy;
		System.out.println("********************************************************");
		for (Object obj: listPoradi) {
			System.out.println(obj.toString());
		}
		System.out.println("********************************************************");

		for (Object obj: listBarvy) {
			System.out.println(obj.toString());
		}
		System.out.println("********************************************************");
		listPoradi2.add(new String("pádesátý"));
		listPoradi2.add(new String("pádesátý První"));
		listPoradi2.add(new String("pádesátý Druhý"));
		listPoradi2.add(new String("pádesátý Třetí"));
		listPoradi2.add(new String("pádesátý Čtvrtý"));
		listPoradi2.add(new String("pádesátý Pátý"));
		listBarvy2.add(new String("fialová"));
		//Collections.copy(listBarvy2, listPoradi2);
		listBarvy2.addAll(listPoradi2);
		
		listPoradi2.set(1,"AAAAA");
		System.out.println("********************************************************");		
		for (String s: listPoradi2) {
			System.out.println(s);
			// listPoradi2.add(new String ("STO")); // tohle skončí Exception
		}
		System.out.println("********************************************************");
		for (String s: listBarvy2) {
			System.out.println(s);
		}
		System.out.println("********************************************************");
		for (int i=0; i<listPoradi2.size();i++) {
			System.out.println(listPoradi2.get(i) + "("+listPoradi2.size()+")");
			if (i == 2) {
				listPoradi2.add(new String("QQQQQQQQQQQQQ"));
			}
		}
		
		
		
	}

	class Poradi {
		private String radek;

		public Poradi(String radek) {
			this.radek = radek;
		}

		public String getRadek() {
			return radek;
		}

		public void setRadek(String radek) {
			this.radek = radek;
		}
		
	}
	
	class Barva {
		private String radek;

		public Barva(String radek) {
			this.radek = radek;
		}

		public String getRadek() {
			return radek;
		}

		public void setRadek(String radek) {
			this.radek = radek;
		}

		@Override
		public String toString() {
			return "Barva [radek=" + radek + "]";
		}
		
	}
}
