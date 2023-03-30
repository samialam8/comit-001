package com.comit.course._w3part1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in);) {
		System.out.print("Input first number: ");
		int num1 = input.nextInt();
		System.out.print("Input second number: ");
		int num2 = input.nextInt();
		
		int product = num1 * num2;
		System.out.println(product);
		
		}
		
	}
	

}
