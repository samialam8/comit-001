package com.comit.course._02_Practice;

//import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {
		/*
		 * Make a program in JAVA such that given as data the enrollment and 5 grades of
		 * a student; Print the enrollment, the average and the word "approved" if the
		 * student has an average greater than or equal to 6, and the word
		 * "not approved" otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT
		 * is an integer variable that represents the student's enrollment. CAL1, CAL2,
		 * CAL3, CAL4 and CAL5 are real-type variables representing the student's 5
		 * grades.
		 */
		/*
		 * In this example, the student's enrollment is 123 and their grades are 7.5,
		 * 8.0, 6.5, 7.0, and 9.0. The program calculates the average grade (which is
		 * 7.4) and determines that the student is approved, since their average grade
		 * is greater than or equal to 6. The program then prints out the enrollment,
		 * average and result.
		 */

		//Scanner scanner = new Scanner(System.in);
		/*
		 * // Input the enrollment and grades
		 * System.out.print("Enter the student's enrollment: "); int enrollment =
		 * scanner.nextInt(); System.out.print("Enter the student's grades CAL1: ");
		 * double cal1 = scanner.nextDouble();
		 * System.out.print("Enter the student's grades CAL2: "); double cal2 =
		 * scanner.nextDouble(); System.out.print("Enter the student's grades CAL3: ");
		 * double cal3 = scanner.nextDouble();
		 * System.out.print("Enter the student's grades CAL4: "); double cal4 =
		 * scanner.nextDouble(); System.out.print("Enter the student's grades CAL5: ");
		 * double cal5 = scanner.nextDouble();
		 * 
		 * // Calculate the average double average = (cal1 + cal2 + cal3 + cal4 + cal5)
		 * / 5;
		 * 
		 * // Determine if the student is approved or not //String result = average >= 6
		 * ? "approved" : "not approved";
		 * 
		 * 
		 * // Print the enrollment, average and result System.out.println("Enrollment: "
		 * + enrollment); System.out.println("Average: "+ average);
		 * //System.out.println("Result: " + result);
		 * 
		 * // Determine if the student is approved or not if (average >= 6) {
		 * System.out.println("The result is aproved"); }else {
		 * System.out.println("The result is not aproved"); } scanner.close();
		 */
		/*
		 * Make the program in JAVA such that given as a worker's salary, apply a 15%
		 * increase if your salary is less than $ 1000 and 12% otherwise. Print the new
		 * salary of the worker. Fact: SUE (variable of real type that represents the
		 * salary of the worker).
		 */

		/*
		 * System.out.println("Enter the worker salary: "); double salary =
		 * scanner.nextDouble();
		 * 
		 * double incSalary = salary * 15/100;
		 * 
		 * if (salary < 1000) { System.out.println("Now the salary of worker is "+
		 * (salary + incSalary) ); } else {
		 * System.out.println("No increment for now salary is more than 1000"); }
		 * scanner.close();
		 */

		/*
		 * Make a program that prints the 10 multiplication tables.
		 */
		/*
		 * 
		 * for (int i = 1; i <= 10; i++) { System.out.println("Multiplication Table of "
		 * + i); System.out.println("--------------------------"); for (int j = 1; j <=
		 * 10; j++) { System.out.println(i + " x " + j + " = " + (i * j)); }
		 * System.out.println(); }
		 */
		// Make a program that prints the 10 multiplication tables.
		/*
		 * System.out.println("Enter the number for table to start: "); int table =
		 * scanner.nextInt();
		 * 
		 * System.out.println("Multiplication Table of " + table);
		 * System.out.println("--------------------------"); for (int j = 1; j <= 10;
		 * j++) { System.out.println(table + " x " + j + " = " + (table * j)); }
		 * scanner.close();
		 */
		/*
		 * Make a calculator.
		 */
		/*
		        double num1, num2, result;
		        char operator;

		        System.out.print("Enter first number: ");
		        num1 = scanner.nextDouble();

		        System.out.print("Enter second number: ");
		        num2 = scanner.nextDouble();

		        System.out.print("Enter operator (+, -, *, /): ");
		        operator = scanner.next().charAt(0);

		        switch (operator) {
		            case '+':
		                result = num1 + num2;
		                System.out.println(num1 + " + " + num2 + " = " + result);
		                break;
		            case '-':
		                result = num1 - num2;
		                System.out.println(num1 + " - " + num2 + " = " + result);
		                break;
		            case '*':
		                result = num1 * num2;
		                System.out.println(num1 + " * " + num2 + " = " + result);
		                break;
		            case '/':
		                if (num2 == 0) {
		                    System.out.println("Cannot divide by zero");
		                } else {
		                    result = num1 / num2;
		                    System.out.println(num1 + " / " + num2 + " = " + result);
		                }
		                break;
		            default:
		                System.out.println("Invalid operator");
		                break;
		        }

		        scanner.close();
		        */
		
		       /*
		        * Calculate the salary increase for a group of employees of a company considering the following criteria: 
		        * If the salary is less than $ 1,000.00: Increase 15% If the salary is greater than or equal to $ 1,000.00: 
		        * Increase 12% The program must do The following: - Save the new salaries in the arrangement - 
		        * Calculate the payroll - Print the salaries from the settlement
		        */
		    }
		


	}


