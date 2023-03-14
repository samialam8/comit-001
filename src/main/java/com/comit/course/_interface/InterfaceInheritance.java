package com.comit.course._interface;

//A class implements an interface, but one interface extends another interface.
interface Download {
	void print();
}

interface Shown extends Download {
	void show();
}

class Display implements Shown {
	public void print() {
		System.out.println("Sam");
	}
	public void show() {
		System.out.println("No Time pass");
	}
}


public class InterfaceInheritance {

	public static void main(String[] args) {
			Display d = new Display();
			d.print();
			d.show();
	}

}
