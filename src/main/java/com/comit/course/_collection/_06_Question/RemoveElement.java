package com.comit.course._collection._06_Question;
/*
 * 6. Write a Java program to remove the third element from a array list.
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		System.out.println(newColors);
		newColors.remove(2);
		System.out.println(newColors);
	}

}
