package mainpackage.andrea;

import org.apache.commons.lang.ArrayUtils;

public class Employee extends Person {
	
	private String function;
	
	private int[] arrayEmployees;

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
	public String getFunctionOfEmployee() {
		return (this.getFunction()+": "+this.getNameSurnameAge());
	}
	
	public void addEmployess() {
		
		
		
		// ArrayUtils.add(new Employee("Jiří","Honzák", 33, "řidič"), arrayEmployees);
		//ArrayUtils.add		
		
		

	}

	public Employee(String name, String surName, int age, String function) {
		super(name, surName, age);
		this.function = function;
	}

	public Employee() {
		super();
	}
	
	
	

	

}
