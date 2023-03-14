package com.comit.course._collection._08_Question;
/*
 * 8. Write a Java program to sort a given array list.
 * Automatically sort with alphabet
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		System.out.println(newColors);
		Collections.sort(newColors);
		System.out.println(newColors);
	}

}
