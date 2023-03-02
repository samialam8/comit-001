package com.comit.course._javatpoint;

/*
 * Initialization through method
 * In this example, we are creating the two objects of Student class and 
 * initializing the value to these objects by invoking the insertRecord method. 
 * Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
 */
class Student3 {
	
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

public class TestStudent3 {

	public static void main(String[] args) {
			Student3 s1 = new Student3();
			Student3 s2 = new Student3();
			
			s1.insertRecord(1, "Raju");
			s2.insertRecord(2, "Sonu");
			
			s1.displayInformation();
			s2.displayInformation();
	}

}
