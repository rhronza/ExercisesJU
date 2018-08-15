package mainpackage.bills;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapStringListOnObjectList {
	class AAA {
		private int id;
		private String name;
		private float price;

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public float getPrice() {
			return price;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public AAA(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}

	}

	List<AAA> aaaItems = new ArrayList<>();

	public MapStringListOnObjectList() {

		aaaItems.add(new AAA(1, "rohlik", 1.50f));
		aaaItems.add(new AAA(2, "chleba", 33.30f));
		aaaItems.add(new AAA(3, "jablka", 29.87f));
		aaaItems.add(new AAA(4, "mléko", 21.50f));

		List<String> nameItems = new ArrayList<String>();
//		nameItems = aaaItems.stream().map(itr -> Objects.toString(itr.getName(), null)).collect(Collectors.toList());
//		nameItems = aaaItems.stream().map(itr -> Objects.toString(itr.getName(), null)).collect(Collectors.toCollection(ArrayList::new));
		nameItems = aaaItems.stream().map(AAA::getName).collect(Collectors.toList());
		
		for (String string : nameItems) {
			System.out.println(string);
		}

	}
}
