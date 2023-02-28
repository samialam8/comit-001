package com.comit.course._06_oop;

import java.util.Scanner;

/*
 * Write a program that asks for a numerical password and allows three attempts. 
 * If the user enters the correct password, it shows "Correct!" And run any program, after the message.
 * Otherwise the program should display "Wrong password". Then finish the program immediately.
 */

class Password {
	int pressPass;
	int attemptsLeft;
	
	Password(int pressPass) { //delete other parameters bcoz default attempt is entered
		//super();
		this.pressPass = pressPass;
		this.attemptsLeft = 3; //directly make default attempts entry to 3
	}
	
	void enterPassword() {
		try (Scanner pass = new Scanner(System.in)) {
			while (attemptsLeft > 0) {
				System.out.print("Enter Password: ");
				int input = pass.nextInt();
				
				if (input == pressPass) {
					System.out.println("Correct!");
					return;
				} else {
					attemptsLeft--;
					System.out.println("Wrong password. "+ attemptsLeft + " attempts left. ");
				}
				
			}
			
			pass.close();
		}
		
	}
		
}

public class Verify {

	public static void main(String[] args) {
		
		Password correctPassword = new Password(1234);
		correctPassword.enterPassword();
	}

}
