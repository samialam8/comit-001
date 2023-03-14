package com.comit.course._collection._09_Question;
/*
 * 9. Write a Java program to copy one array list into another. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArray {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		List<String> newArray = new ArrayList<String>();
		newArray.add("Boy");//0
		newArray.add("Girl");//1
		newArray.add("Man");//2
		newArray.add("Women");//3
		newArray.add("Stone");//4
		
		//System.out.println(newColors);
		//System.out.println(newArray);
		//copy newArray to newColors
		//Collections.copy(newColors, newArray);
		//copy newColors to newArray
		Collections.copy(newArray, newColors);
		System.out.println(newArray);
		
		
	}

}
