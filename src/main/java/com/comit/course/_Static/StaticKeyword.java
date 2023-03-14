package com.comit.course._Static;

class Student5 {
	int rollno;//instance variable
	String name;
	static String college = "ITS";//static variable
	
	//constructor
	
	Student5(int r, String n) {
		rollno = r;
		name = n;
	}
	
	//method to display values
	void displays() {
		System.out.println(rollno + " " + name + " " + college);
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
			Student5 s1 = new Student5(100, "Kaali");
			Student5 s2 = new Student5(200, "Baali");
		   /* to update static variable we can use single code
			*Student5.college = "BBDIT";
			*/
			
			s1.displays();
			s2.displays();
	}

}
