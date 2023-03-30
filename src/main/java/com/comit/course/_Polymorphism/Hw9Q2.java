package com.comit.course._Polymorphism;


class A1 {
	
	int id;
	String name;
	
	A1() {
		System.out.println("Constructor when we don't have any constructor");
		System.out.println("Java create default constructor automatically when we don't have constructor\n");
	}

	A1(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Id and name is as follows: " + id + " " + name);
	}
	
}
class B1 {
	int age;
	
	B1() {
		System.out.println("Constructor when we don't have any constructor");
		System.out.println("Java create default constructor automatically when we don't have constructor");
	}

	B1(int age) {
		this.age = age;
		
		System.out.println("And Age is: "+ age);
	}
	
	
}

class C1 extends A {
	
	C1(int id, String name, int age) {
		System.out.println(id + " " + name + " " + age);
		
	}
		
	
}

public class Hw9Q2 {

	public static void main(String[] args) {
//			C1 objc = new C1(101, "Sam", 34);
//			B1 objb = new B1(101);
//			A1 obja = new A1(101, "Sam");
			//B objb = new B();
			
	}

}

