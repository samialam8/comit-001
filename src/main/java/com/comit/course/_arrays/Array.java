package com.comit.course._arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * Make a program in JAVA such that given as data the enrollment and 5 grades of a student; 
		 * Print the enrollment, the average and the word "approved" if the student has an average greater than or equal to 6, and the word "not approved" otherwise. 
		 * Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable that represents the student's enrollment. 
		 * CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
		 * */
		/*String message = "Hello World";
		System.out.println(message);
		
		int myLength = "Hello World" .length();
		System.out.println(myLength);
		
		String upCase = "Hello World".toUpperCase();
		System.out.println(upCase);
		
		String startInd = upCase.substring(0,1);
		System.out.println(startInd);
		*/
		String names = "Peter, John, Andy";
		String[] splitNames = names.split(",");
		for (String a : splitNames)
            System.out.print(a);
		
		int[] userAge = {21, 22, 23, 24};
		userAge[2] = userAge[2] + 48;
		System.out.println(userAge[2]);
		
        //String[] brands = { "Toyota", "Ford", "Nissan", "BMW" };
	    
	    String[] d = new String[4];
	    d[0] = "John";
	    d[1] = "Jane";
	    
	    System.out.println( Arrays.toString( d ));

	}

}
