package com.comit.course._collection._05_Question;
/*
 * 5. Write a Java program to update specific array element by given element.
 */

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		//insert element at first position
		newColors.add(0, "White");
		
		
		
		System.out.println(newColors);

		newColors.set(2, "Yellow");
		//System.out.println(newColors.get(3));
		//System.out.println(newColors.get(5));
		newColors.set(4, "Brown");
		
		System.out.println(newColors);

	}

}
