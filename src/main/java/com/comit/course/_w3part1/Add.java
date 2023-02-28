package com.comit.course._w3part1;

import java.util.Scanner;

public class Add {
	
	int num1;
	int num2;
	
	

	Add() {
		try(Scanner num = new Scanner(System.in)) {
		System.out.println("Enter first number: ");
		this.num1 = num.nextInt();
		System.out.println("Enter second number: ");
		this.num2 = num.nextInt();
		}
	}
	
	public void display() {
		System.out.println("The addition of two number is " + (num1 + num2));
		
	}



	public static void main(String[] args) {
		
		Add digit = new Add();
		digit.display();

	}

}
