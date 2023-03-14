package com.comit.course._collection._02_FirstQuestion;
/*
 * 2. Write a Java program to iterate through all elements in a array list. 
 */

import java.util.ArrayList;
import java.util.List;

public class IterateElements {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");
		newColors.add("Red");
		newColors.add("Orange");
		newColors.add("Blue");
		newColors.add("Black");
		
		newColors.forEach(System.out::println);//preferred way for iteration using forEach
	}

}
