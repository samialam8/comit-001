package com.comit.course._06_oop;

class Employee {//first step creating attributes or making construction map
	int id;
	String name;
	double salary;
	String position;
	
	//To follow encapsulation OOP concept we should use getter and setter and it should be in the class not in method
	
	
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}


	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}


	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}


	void display( ) { //method started with display without returning value
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	

	double bonusEmployee(double percentage) {//method started with display with returning value
		double empBonusCompany = (salary * percentage)/100;
		return empBonusCompany;
	}
}

public class MyClass {

	public static void main(String[] args) { //now creating an object of the class
		//created an object called emp1 from class Employee
		 Employee emp1 = new Employee();
		 
		 //using getter and setter to initialize the object
		 emp1.setId(1030);
		 emp1.setName("Jane");
		 emp1.setSalary(10000);
		 emp1.setPosition("Director");
		 
		 emp1.display();
		 double bonus = emp1.bonusEmployee(8);
		 System.out.println("bonus: " + bonus);
		 //emp1.id;

	}

}
