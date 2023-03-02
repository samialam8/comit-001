package com.comit.course._javatpoint;

public class OverloadingConstr {
	
	int id;
	String name;
	int age;
	
	//creating two arg constructor
	OverloadingConstr(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//creating three arg constructor
	OverloadingConstr(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display( ) {
		System.out.println("Id:" + id + " Name:" + name + " Age:" + age);
	}
	

	public static void main(String[] args) {
		OverloadingConstr o1 = new OverloadingConstr(101, "Sam"), o2 = new OverloadingConstr(102, "Ravi", 34);
		
		o1.display();
		o2.display();

	}

}
