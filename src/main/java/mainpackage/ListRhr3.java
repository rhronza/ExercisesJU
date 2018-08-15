package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class ListRhr3 {

	class Person {
		private String name;
		private String surname;
		private int age;
		public String getName() {
			return name;
		}
		public String getSurname() {
			return surname;
		}
		public int getAge() {
			return age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Person(String name, String surname, int age) {
			super();
			this.name = name;
			this.surname = surname;
			this.age = age;
		}
		
		
	}
	private List<Person> persons = new ArrayList<>(); 
	
	public ListRhr3() {
		
		persons.clear();
		persons.add(new Person("Roman", "Hronza", 53));
		persons.add(new Person("Pavel", "Lukeš", 33));
		persons.add(new Person("Roman", "Honza", 24));
		persons.add(new Person("Jiří", "Oplatka", 46));
		
		for (Person person : persons) {
			System.out.println(person.getName()+" "+person.getSurname()+", "+person.getAge());
			for (Person personIneer : persons) {
				if (personIneer.getName().equals(person.getName())) {
					System.out.println("    Surname:"+personIneer.getSurname()+", age"+personIneer.getAge());
					
				}
				
			}
			
		}
		
	
	}

}
