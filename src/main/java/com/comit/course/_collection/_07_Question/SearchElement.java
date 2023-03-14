package com.comit.course._collection._07_Question;
/*
 * 7. Write a Java program to search an element in a array list.
 */

import java.util.ArrayList;
import java.util.List;

public class SearchElement {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		/*
		System.out.println(newColors);
		newColors.contains("Orange");
		System.out.println(newColors);
		*/
		if (newColors.contains("Orange")){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
