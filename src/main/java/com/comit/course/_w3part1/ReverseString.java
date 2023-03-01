package com.comit.course._w3part1;

import java.util.Scanner;

public class ReverseString {

	String word;

	ReverseString() {
		try (Scanner as = new Scanner(System.in)) {
			System.out.println("Enter a sentense: ");
			this.word = as.nextLine();

		}

	}

	public void displayString() {
		char[] letter = word.toCharArray();
		System.out.println("Reverse string: ");
		System.out.println("The length of sentence is: " + word.length());
		for (int i = letter.length - 1; i >= 0; i--) {
			System.out.print(letter[i]);
		}
	}

	public static void main(String[] args) {
		ReverseString ob = new ReverseString();
		ob.displayString();
	}

}
