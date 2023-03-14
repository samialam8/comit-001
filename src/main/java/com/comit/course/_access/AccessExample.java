package com.comit.course._access;

class MyClass {
	 int num;
	
	void print() {
		System.out.println("MyClass: " + num);
	}
}

public class AccessExample {

	public static void main(String[] args) {
			MyClass obj = new MyClass();
			obj.num = 4;
			obj.print();
	}

}
