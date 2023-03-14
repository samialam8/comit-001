package com.comit.course._Polymorphism;

class Vehicle {//parent class
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("BIke is running");
	}
}
public class OverridingMethod {

	public static void main(String[] args) {
			Vehicle b2 = new Bike(), b3 = new Vehicle();
			//Vehicle b3 = new Vehicle();
			b2.run();//calling method
			b3.run();//calling method
	}

}
