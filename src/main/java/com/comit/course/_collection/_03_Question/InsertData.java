package com.comit.course._collection._03_Question;
/*
 * 3. Write a Java program to insert an element 
 * into the array list at the first position.
 */

import java.util.ArrayList;
import java.util.List;

public class InsertData {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");
		newColors.add("Red");
		newColors.add("Orange");
		newColors.add("Blue");
		newColors.add("Black");
		
		//insert element at first position
		newColors.add(0, "White");
		
		newColors.forEach(System.out::println);
	}

}
