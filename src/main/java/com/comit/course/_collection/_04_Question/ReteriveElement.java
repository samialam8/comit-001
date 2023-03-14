package com.comit.course._collection._04_Question;

import java.util.ArrayList;
import java.util.List;

/*
 * 4. Write a Java program to retrieve an element (at a specified index) 
 * from a given array list. 
 * 
 */

public class ReteriveElement {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		//insert element at first position
		newColors.add(0, "White");
		
		
		
		System.out.println(newColors.get(3));
		System.out.println(newColors.get(5));
		
		
	}

}
