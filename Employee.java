package com.Employee;

public class Employee {
	String name="Saurab",city="chennai";
	int age=23;
	void display() {
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
	public static void main(String[] args) {
		Employee a=new Employee();
		a.display();
		Employee b=new Employee();
		b.display();

	}

}
