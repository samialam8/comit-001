package com.comit.course._Polymorphism;

class A {
	
	A() {
		System.out.println("Constructor when we don't have any constructor");
		System.out.println("Java create default constructor automatically when we don't have constructor\n");
	}
	
}
class B {
	
	
	B() {
		System.out.println("Constructor when we don't have any constructor");
		System.out.println("Java create default constructor automatically when we don't have constructor");
	}
}

class C extends A {
	
		
	
}

public class Hw9Q1 {

	public static void main(String[] args) {
			C objc = new C();
			//B objb = new B();
	}

}
