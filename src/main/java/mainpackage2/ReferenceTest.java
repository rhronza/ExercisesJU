package mainpackage2;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTest {

	/**
	 * @author roman
	 *
	 */
	class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

//		@Override
//		public String toString() {
//			return "Person [name=" + name + ", age=" + age + "]";
//		}

	}

	public ReferenceTest() {
		List<Person> personItems = new ArrayList<>();
		List<Person> less50personItems = new ArrayList<>();
		List<Person> currPersonItems = new ArrayList<>();
		List<Person> less30personItems = new ArrayList<>();

		personItems.add(new Person("Roman", 54));
		personItems.add(new Person("Slávek", 51));
		personItems.add(new Person("Alex", 15));
		personItems.add(new Person("Andrea", 30));
		personItems.add(new Person("Maruška", 52));
		personItems.add(new Person("Sofi", 12));

		currPersonItems.clear();
		for (Person person : personItems) {
			if (person.getAge() < 30) {
				currPersonItems.add(person);
			}
		}
		less30personItems.addAll(currPersonItems);
		System.out.println("Person < 30 year old:");
		System.out.println("----------------------");
		System.out.println(less30personItems);
		System.out.println(less30personItems.hashCode());
		System.out.println("----------------------");
		for (Person person : less30personItems) {
			System.out.println(person.toString());
			System.out.println(person.hashCode());
			System.out.println("---");
		}
		System.out.println("");
		// currPersonItems.clear();
		currPersonItems = new ArrayList<>();

		System.out.println("current after clear:");
		System.out.println("----------------------");
			for (Person person : currPersonItems) {
				System.out.println(person.toString());
			}
		System.out.println("");

		System.out.println("Person < 30 year old:");
		System.out.println("----------------------");
		for (Person person : less30personItems) {
			System.out.println(person.toString());
		}
		System.out.println("");

	}

}
