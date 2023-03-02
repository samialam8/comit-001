package com.comit.course._javatpoint;

class Student2 {
	int id;
	String name;
}

public class TestStudent2 {

	public static void main(String[] args) {
			Student2 s1 = new Student2();
			Student2 s2 = new Student2();
			
			s1.id = 101;//initializing an object with reference variable
			s1.name = "Ran";
			s2.id = 102;
			s2.name = "Sonu";
			
			System.out.println(s1.id + " " + s1.name);
			System.out.println(s2.id + " " + s2.name);
	}

}
