package com.comit.course._w3part1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
			try(Scanner input  = new Scanner(System.in);) {
			
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			
		if(num > 0 & num < 11) {
			for (int i = 1; i<= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
		} else {
			System.out.println("Number out of range");
		}
	}
 }

}
