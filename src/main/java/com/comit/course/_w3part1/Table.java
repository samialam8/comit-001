package com.comit.course._w3part1;

import java.util.Scanner;

public class Table {
	
	int num1;
	

	Table() {
		try(Scanner mul = new Scanner(System.in)){
		System.out.println("Enter any number:");
		this.num1 = mul.nextInt();
		}
	}

public void tableToTen() {
	
	System.out.println("Multiplication Table of " + num1);
	for (int j = 1; j <= 10; j++) { 
		System.out.println(num1 + " x " + j + " = " + (num1 * j));
		}
	
}

	public static void main(String[] args) {
		Table display = new Table();
		display.tableToTen();

	}

}
