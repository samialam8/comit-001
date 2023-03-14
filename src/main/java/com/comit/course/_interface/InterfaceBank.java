package com.comit.course._interface;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}
public class InterfaceBank {

	public static void main(String[] args) {
			Bank s = new SBI(), p = new PNB();
			System.out.println(s.rateOfInterest());
			System.out.println(p.rateOfInterest());
			
	}

}
