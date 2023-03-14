package com.comit.course._collection._01_FirstQuestion;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Write a Java program to create a new array list, 
 * add some colors (string) and print out the collection.
 */

public class ArrayColors {

	public static void main(String[] args) {
			
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");
		newColors.add("Red");
		newColors.add("Orange");
		newColors.add("Blue");
		newColors.add("Black");
		
		System.out.println(newColors);
		
	}

}
