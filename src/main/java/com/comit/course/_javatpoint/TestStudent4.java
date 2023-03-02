package com.comit.course._javatpoint;

/*
 * Initialization through a constructor
 */

class Student4 {
	int id;
	String name;
	double salary;
	
	/*
	 * //if you don't want to initialize parameter to (insert) while creating object (s1,s2,s3) then 
	 * write different name other than class (Student4)
	 */
	void insert(int id, String name, float salary) { 
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
	
	
}


public class TestStudent4 {

	public static void main(String[] args) {
			
		Student4 s1 = new Student4(), s2 = new Student4(), s3 = new Student4();
		//Student4 s2 = new Student4();
		//Student4 s3 = new Student4();
		
		s1.insert(1, "Sam", 10000);
		s2.insert(2, "Pam", 20000);
		s3.insert(3, "Lam", 30000);
		
		s1.display();
		s2.display();
		s3.display();
	}

}
