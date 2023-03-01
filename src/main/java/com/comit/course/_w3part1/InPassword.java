package com.comit.course._w3part1;

import java.util.Scanner;

public class InPassword {
	
	int num;
	int attempts;
	
	
	InPassword(int num) {
		this.num = num;
		this.attempts = 3;
	}
	
	void display() {
		try(Scanner number = new Scanner(System.in)){
			while (attempts > 0) {
				System.out.println("Enter four digit number: ");
			    int pass = number.nextInt();
			
				if (pass == num) {
					System.out.println("Correct");
					return;
				} else {
					attempts--;
					System.out.println("Wrong Password. "+ attempts + " attempts left. ");
				}
			}
		}
	}




	public static void main(String[] args) {
		InPassword sa = new InPassword(1234);
		sa.display();
		
	}

}
