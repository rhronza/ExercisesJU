package mainpackage.andrea;

public class Person {
	
	private String name;
	private String surName;
	private int age;
	
	public String getName() {
		return name;
	}
	public String getSurName() {
		return surName;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, String surName, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	public String getNameSurnameAge() {
		return (this.getName()+" "+this.surName+", age="+this.age);
	}
	

	

}
