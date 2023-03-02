package com.comit.course._javatpoint;

public class Student {
	
	//defining Attributes or field
	int id; //field or data member or instance variable
	String name;
	
	

	public static void main(String[] args) { // creating main method
		
		Student s1 = new Student();//creating an object(s1) of student(class)
		System.out.println(s1.id);//accessing member through reference variable
		System.out.println(s1.name);
		
	}

}
