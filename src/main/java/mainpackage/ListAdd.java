package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

	class Person {
		private String name;
		private int age;
		private List<Address> adrresses;

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public List<Address> getAdrresses() {
			return adrresses;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAdrresses(List<Address> adrresses) {
			this.adrresses = adrresses;
		}

		public Person(String name, int age, List<Address> adrresses) {
			this.name = name;
			this.age = age;
			this.adrresses = adrresses;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", adrresses=" + adrresses + "]";
		}
	}

	class Address {
		private String steet;
		private int number;
		private String city;

		public String getSteet() {
			return steet;
		}

		public int getNumber() {
			return number;
		}

		public String getCity() {
			return city;
		}

		public void setSteet(String steet) {
			this.steet = steet;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Address(String steet, int number, String city) {
			this.steet = steet;
			this.number = number;
			this.city = city;
		}

		@Override
		public String toString() {
			return "address [steet=" + steet + ", number=" + number + ", city=" + city + "]";
		}

	}

	private List<Person> seznamA = new ArrayList<>();
	private List<Person> seznamB = new ArrayList<>();
	private List<Address> addressesList = new ArrayList<>();

	ListAdd() {

		seznamA.add(new Person("Roman", 54, new ArrayList<>()));
		seznamA.get(0).getAdrresses().add(new Address("Maxe Švabinského", 2665, "Most"));
		seznamA.get(0).getAdrresses().add(new Address("Maxe Švabinského", 2666, "Most"));
		seznamA.get(0).getAdrresses().add(new Address("Maxe Švabinského", 2667, "Most"));

		seznamA.add(new Person("Honza", 30, new ArrayList<>()));
		seznamA.get(1).getAdrresses().add(new Address("Thamova", 21, "Praha"));
		seznamA.get(1).getAdrresses().add(new Address("Thamova AAA", 22, "Praha"));
		seznamA.get(1).getAdrresses().add(new Address("Thamova BBB ", 23, "Praha"));

		seznamA.add(new Person("Andrea", 24, new ArrayList<>()));
		seznamA.get(2).getAdrresses().add(new Address("Hloubětín", 21, "Praha"));
		seznamA.get(2).getAdrresses().add(new Address("Hloubětín", 22, "Praha 10"));
		seznamA.get(2).getAdrresses().add(new Address("Hloubětín", 23, "Praha 6"));

		for (Person person : seznamA) {
			for (Address address : person.getAdrresses()) {
				if (address.getNumber() < 1000) {
					addressesList.add(address);
				}
			}
		}

		System.out.println("adresses:");
		System.out.println("------------");
		for (Address address : addressesList) {
			System.out.println("   " + address);
		}

		// if (person.getAge()<50) {
		// seznamB.add(new Person(person.getName(), person.getAge()));
		// seznamB.add(person);
		// }
		// seznamA.clear();
		seznamA = new ArrayList<>();
		System.out.println("seznamB:");
		System.out.println("------------------");
		for (Person person : seznamB) {
			System.out.println(person.getName());
			for (Address address : person.getAdrresses()) {
				System.out.println("     " + address);
			}

		}

	}

}
