package com.comit.course._06_oop;

class Employee1 {//first step creating attributes or making construction map
	private int id;
	String name;
	double salary;
	String position;
	
	//using constructor method
	
	Employee1() {//constructor have same name of the class and returns nothing not even void
		//Default constructor created by java automatically that we dont see it when we dont have any constructor
	}
	
	
	
	Employee1(int id, String name, double salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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


public class MyConstructor {

	public static void main(String[] args) { 
		
		Employee1 emp1 = new Employee1(1040, "Jane", 100000, "cordinator");
		
		emp1.display();
		double bonus = emp1.bonusEmployee(8);
		System.out.println("bonus: "+ bonus);

	}

}
