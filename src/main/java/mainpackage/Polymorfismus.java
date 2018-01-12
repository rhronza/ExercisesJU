package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class Polymorfismus {
	
	private List<Osoba> osoby = new ArrayList<Osoba>();
	private List<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec>();
	private List<Object> seznam = new ArrayList<Object>();
	
	

	public Polymorfismus() {
		
		osoby.add(new Osoba("Roman Hronza","21.9.1964"));
		osoby.add(new Osoba("Bohuslav Hronza","17.10.1967"));
		osoby.add(new Osoba("Marie Karasová","29.12.1965"));
		osoby.add(new Zamestnanec("Petr Rychlý","10.5.2005","ekonom"));
		System.out.println("OSOBY:");
		if ( osoby.size()>0) {
			for (int i=0; i<osoby.size();i++) {
				System.out.println(osoby.get(i).toString());
				if ("Bohuslav Hronza".equals(osoby.get(i).getName())) {
					osoby.add(new Osoba("John Connor", "4.8.2023"));
				}
			}
		}
		System.out.println();
		
		seznam.add(new Zamestnanec("Filip Karas","1.11.1998","finanční ředitel"));
		seznam.add(new Osoba("Karel Novák", "4.12.1911"));
		System.out.println("SEZNAM:");
		for (Object obj: seznam) {
			System.out.println(obj.toString());
			
		}
		
	}
	

	class Osoba {
		private String name;
		private String dateofBirthday;
		
		
		public Osoba(String name, String dateofBirthday) {
			super();
			this.name = name;
			this.dateofBirthday = dateofBirthday;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDateofBirthday() {
			return dateofBirthday;
		}
		public void setDateofBirthday(String dateofBirthday) {
			this.dateofBirthday = dateofBirthday;
		}
		@Override
		public String toString() {
				return "Osoba [Name=" + name + ", dateofBirthday=" + dateofBirthday + "]";
		}
		
	}
	
	class Zamestnanec extends Osoba{
		
		private String function;

		public Zamestnanec(String name, String dateofBirthday, String function) {
			super(name, dateofBirthday);
			this.function = function;
		}

		public String getFunction() {
			return function;
		}

		public void setFunction(String function) {
			this.function = function;
		}

		@Override
		public String toString() {
			return "Zamestnanec [function=" + function + ", getName()=" + getName() + ", getDateofBirthday()="
					+ getDateofBirthday() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
	
	}

}
