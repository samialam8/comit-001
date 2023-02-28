package com.comit.course._w3part1;

import java.util.Scanner;

public class BasicOne {
	
	String name;
	

	BasicOne() {
		try (Scanner greet = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			this.name = greet.next();
		}
		
	}
	
	public void display() {
		System.out.println("Hello");
		System.out.println(name);
	}



	public static void main(String[] args) {
		BasicOne wel = new BasicOne();
		wel.display();
	}

}
