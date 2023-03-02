package com.comit.course._javatpoint;

/*
 * Java Program to demonstrate the working of a banking-system  
 * where we deposit and withdraw amount from our account.  
 * Creating an Account class which has deposit() and withdraw() methods  
 */

class Account {
	int acc_no;
	String name;
	double amount;
	
	//Method to initialize object
	
	void insert(int a, String n, double amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	//deposit method
	void deposit(double amt) {
		amount  = amount + amt; //amount=1000, amt=40000
		System.out.println(amt + " deposited ");
	}
	//withdraw method
	void withdraw(double amt) {
		if(amount < amt) {//amount=41000 amt = 15000
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;//41000-15000
			System.out.println(amt + " withdrawn");
		}
	}
	//method to check balance
	void checkBalance() {
		System.out.println("Balance is: "+ amount);
	}
	//method to display the value of an object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

//creating a test class to deposit and withdraw amount

public class TestAccount {

	public static void main(String[] args) {
			Account a1 = new Account();
			a1.insert(832345, "Raju", 1000);
			
			a1.display();
			
			a1.checkBalance();
			
			a1.deposit(40000);
			a1.checkBalance();
			a1.withdraw(15000);
			a1.checkBalance();
	}

}
