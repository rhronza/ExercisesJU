package mainpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
// import java.util.Set;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class SetRhr {

	
	class Person {
		private String name;
		private int age;
		/* private Float weight; */
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		
		/*
		public Float getWeight() {
			return weight;
		}
		*/
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		/*
		public void setWeight(Float weight) {
			this.weight = weight;
		}
		*/
		
		public Person(String name, int age/*, Float weight*/) {
			super();
			this.name = name;
			this.age = age;
		/*	this.weight = weight; */
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age /*+ ", weight=" + weight + "]" */;
		}
		
		
	}
	public SetRhr() {
		System.out.println("=========================================================================");
		Set<List<String>> result = Sets.cartesianProduct(
                ImmutableSet.of("q", "w"),
                ImmutableSet.of("a", "s"),
                ImmutableSet.of("z", "x")
        );
		
		System.out.println(result);
		
		System.out.println("=========================================================================");
		
		
		Set<Person> setPersons = new LinkedHashSet<Person>();
		
		List<Person> listPerson01 = new ArrayList<>();
		for (Person person : listPerson01) {
			
		}
		listPerson01.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson01.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson01.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson01.add(new Person("Pavel", 28/*, 84.5f*/));
		
		List<Person> listPerson02 = new ArrayList<>();
		listPerson02.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson02.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson02.add(new Person("Karel", 28/*, 84.5f*/));
		listPerson02.add(new Person("Roman", 28/*, 84.5f*/));
		
		/*
		listPerson01.add(new Person("Pavel", 33, 82.5f));
		listPerson01.add(new Person("Karel", 28, 84.4f));
		listPerson01.add(new Person("Karel", 28, 84.5f));
		listPerson01.add(new Person("Karel", 28, null));
		listPerson01.add(new Person("Karel", 28, null));
		listPerson01.add(new Person("Karel", 28, 84.5f));
		*/
		
		setPersons.addAll(listPerson01);
		setPersons.addAll(listPerson02);
		
		System.out.println("=========================================================================");
		System.out.println("Set: ");
		System.out.println("=========================================================================");
		for (Person person : setPersons) {
			System.out.println(person.toString());
		}
		
		System.out.println("=========================================================================");
		System.out.println("List: ");
		System.out.println("=========================================================================");
		List<Person> listPerson03 = new ArrayList<Person>(setPersons);
		for (Person person : listPerson03) {
			System.out.println(person.toString());
		}
		System.out.println("=========================================================================");
		
	}

}
