package com.comit.course._Polymorphism;

class Adder1 {
	static int add1(int a, int b) {
		return a+b;
	}
	static double add1(double a, double b, double c) {
		return a + b + c;
	}
}

public class OverloadingChangingDatatypes {

	public static void main(String[] args) {
			System.out.println(Adder1.add1(120, 120));
			System.out.println(Adder1.add1(22.4, 200, 200));
	}

}
