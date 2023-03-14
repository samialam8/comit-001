package com.comit.course._javatpoint;

class Bank {
	
	int getRateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class Icici extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class Axix extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class OverridingBankExample {

	public static void main(String[] args) {
			Sbi s1 = new Sbi();
			Icici i1 = new Icici();
			Axix a1 = new Axix();
			
			System.out.println(s1.getRateOfInterest());
			System.out.println(i1.getRateOfInterest());
			System.out.println(a1.getRateOfInterest());
			
	}

}
