package mainpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRhr2 {



	public ListRhr2() {

		// method1();
		
		concateIntegerLists();

	}

	private void concateIntegerLists() {
		
		List<Integer> stoneShops = new ArrayList<>();
		List<Integer> onlineShops = new ArrayList<>();
		
		stoneShops.add(111);
		stoneShops.add(222);
		stoneShops.add(333);
		
		onlineShops.add(745);
		onlineShops.add(852);
		onlineShops.add(951);
		onlineShops.add(659);
		
		stoneShops.addAll(onlineShops);
		
		System.out.println("concateShopsLists");
		System.out.println("");
		for (Integer integer : stoneShops) {
			System.out.println(integer);
			
		}
		
		
		

	}

	private void method1() {
		
		List<Object> listPoradi = new ArrayList<Object>();
		List<Object> listBarvy = new ArrayList<Object>();
		
		List<String> listPoradi2 = new ArrayList<String>();
		List<String> listBarvy2 = new ArrayList<String>();
		
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

		// listPoradi = listBarvy;

		// System.out.println("********************************************************");
		// System.out.println("listPoradi (obsahuje barvy)");
		// System.out.println("********************************************************");
		// for (Object obj: listPoradi) {
		// System.out.println(obj.toString());
		// }
		// System.out.println("********************************************************");
		// System.out.println("listBarvy");
		// System.out.println("********************************************************");
		// for (Object obj: listBarvy) {
		// System.out.println(obj.toString());
		// }
		// System.out.println("********************************************************");

		/* ============================================================================================================================================== */

		listPoradi2.add(new String("pádesátý"));
		listPoradi2.add(new String("pádesátý První"));
		listPoradi2.add(new String("pádesátý Druhý"));
		listPoradi2.add(new String("pádesátý Třetí"));
		listPoradi2.add(new String("pádesátý Čtvrtý"));
		listPoradi2.add(new String("pádesátý Pátý"));

		listBarvy2.add(new String("fialová"));
		listBarvy2.add(new String("žlutá"));
		listBarvy2.add(new String("černá"));

		// Collections.copy(listBarvy2, listPoradi2);

		listBarvy2.addAll(listPoradi2);

		System.out.println("********************************************************");
		System.out.println("listBarvy2");
		System.out.println("********************************************************");
		for (String s : listBarvy2) {
			System.out.println(s);
		}
		System.out.println("********************************************************");

		// listPoradi2.set(1,"AAAAA");

		System.out.println("********************************************************");
		System.out.println("listPoradi2");
		System.out.println("********************************************************");
		for (String s : listPoradi2) {
			System.out.println(s);
			// listPoradi2.add(new String ("STO")); // tohle skončí Exception
		}
		System.out.println("********************************************************");
		System.out.println("aktualizace seznamu");
		System.out.println("********************************************************");
		for (int i = 0; i < listPoradi2.size(); i++) {
			System.out.println(listPoradi2.get(i) + "(size=" + listPoradi2.size() + ")");
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
