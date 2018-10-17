package mainpackage2;

import java.util.ArrayList;
import java.util.List;

public class ListReferences {
	class Address {
		private String street;
		private Integer houseNumber;

		public Address(String street, Integer houseNumber) {
			this.street = street;
			this.houseNumber = houseNumber;
		}

		public String getStreet() {
			return street;
		}

		public Integer getHouseNumber() {
			return houseNumber;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public void setHouseNumber(Integer houseNumber) {
			this.houseNumber = houseNumber;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", houseNumber=" + houseNumber + "]";
		}
	}

	class Person {
		private String name;
		private String surName;
		private List<Address> adresses;

		public Person(String name, String surName, List<Address> adresses) {
			this.name = name;
			this.surName = surName;
			this.adresses = adresses;
		}

		public String getName() {
			return name;
		}

		public String getSurName() {
			return surName;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSurName(String surName) {
			this.surName = surName;
		}

		public List<Address> getAdresses() {
			return adresses;
		}

		public void setAdresses(List<Address> adresses) {
			this.adresses = adresses;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", surName=" + surName + ", adresses=" + adresses + "]";
		}

	}

	List<Person> persons = new ArrayList<>();
	List<Address> adresses = new ArrayList<>();

	public ListReferences() {

		adresses.add(new Address("Stromovka", 4709));
		adresses.add(new Address("Blatenská", 4041));
		adresses.add(new Address("Maxe švabinského", 2665));

		persons.add(new Person("Roman", "Hronza", new ArrayList()));
		persons.get(0).getAdresses().add(adresses.get(0));
		persons.get(0).getAdresses().add(adresses.get(1));
		persons.get(0).getAdresses().add(adresses.get(2));

		persons.add(new Person("Honza", "Štícha", new ArrayList()));
		persons.get(1).getAdresses().addAll(adresses);
		List<Address> adresses2 = persons.get(0).getAdresses();
		
		

		
		
		adresses.clear();
		System.out.println("adresses="+adresses);
		
		// adresses.get(1).setStreet(adresses.get(1).getStreet()+"AAA");

		System.out.println("Persons");
		for (Person person : persons) {
			System.out.println("   " + person);
		}

		System.out.println("adresses2");
		for (Address address: adresses2) {
			System.out.println("   " + address);
		}
		
		
		List<Address> adresses3 = new ArrayList<>();
		for (Address adrs: persons.get(0).getAdresses() ) {
			adresses3.add(adrs);
		}
		System.out.println("adresses3:");
		for (Address address: adresses3) {
			System.out.println("   " + address);
		}

		
		System.out.println("Persons");
		for (Person person : persons) {
			System.out.println("   " + person);
		}

	}

}
